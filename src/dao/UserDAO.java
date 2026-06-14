
package dao;

import db.conexionDB; //comunique con la bd
import model.User;
import utils.HashUtil;
import java.sql.*; 
import javax.swing.JOptionPane;

public class UserDAO {
    //METODO PARA VERIFICAR EXISTENCIA DE USERNAME
    public boolean userExist(String username){ 
        
        String SQL = "SELECT COUNT(*) FROM users WHERE username = ?";
        try (Connection conn = conexionDB.conectar(); 
            PreparedStatement stmt = conn.prepareStatement(SQL);){ 
            
            stmt.setString(1, username);
            
            try (ResultSet rs = stmt.executeQuery()){
                if (rs.next()){
                    //di Count da > 0 es porque ya hay un username asi
                    return rs.getInt(1) > 0;
                }
            }

        } catch(Exception e) {

            System.out.println("Error al verificar usuario: " + e.getMessage());
        }
        return false;
    }
    
    
    public boolean strongPassword(String password){
        
        if (password == null){
            return false;
        }
             
        int len = password.length();
        
        if (len < 8){
            System.out.println("La contraseña debe tener al menos 8 caracteres.");
            return false;
        }
        
        //de JAVA
        /*
        (?=.*[a-zA-Z])      es para letras
        (?=.*\d)            si tiene numeros
        (?=.*[!@#$%^&*()_+\-=\[\]{};':"\\|,.<>\/?])      para los simbolos
        .{8,}   
        */
        String regex = "^(?=.*[a-zA-Z])(?=.*\\d)(?=.*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]).{8,}$";
        
        if (password.matches(regex)){
            return true;
        }else{
            System.out.println("La contraseña debe incluir letras, números y al menos un carácter especial (ej: !, @, #, $, etc.).");
            return false;
        }
    }
    
    //METODO PARA CREAR USUARIOS
    public boolean createUser(User user){ //user es un tipo de dato
        //1ro validamos antes de hacer el INSERT
        if (userExist(user.getUsername())){
            javax.swing.JOptionPane.showMessageDialog(null, "El nombre de usuario '" + user.getUsername() + "' ya existe", "Usuario duplicado", javax.swing.JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
        //2do VALIDAMOS PASSWORD
        if(!strongPassword(user.getPassword())){
            javax.swing.JOptionPane.showMessageDialog(null, "No se pudo crear usuario porque la contraseña no cumple con los requisitos de seguridad", "Contraseña Insegura", javax.swing.JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
        
        //INSERT
        String SQL = "INSERT INTO users(username, email, password) VALUES (?, ?, ?)"; //LOS ? SON PLACEHOLDERS
        try (Connection conn = conexionDB.conectar(); //Nos conectamos  
            PreparedStatement stmt = conn.prepareStatement(SQL);){ 
            
            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getEmail());
            
            //hash password
            String hashedPassword = HashUtil.hashPassword(user.getPassword());
            stmt.setString(3, hashedPassword);  

            stmt.executeUpdate();

            System.out.println("Usuario creado");
            return true;

        } catch(Exception e) {
            System.out.println(e.getMessage());
            
            return false;
        }
    }
    
    
        //METODO PARA ACCEDER - login
        public boolean login(String username, String password) {
            String SQL = "SELECT password FROM users WHERE username = ?";

            try (Connection conn = conexionDB.conectar();   
                PreparedStatement stmt = conn.prepareStatement(SQL);){

                stmt.setString(1, username);

                ResultSet rs = stmt.executeQuery();

                if (rs.next()){

                    String storedHash = rs.getString("password"); //buscamos el hash guardado
                    String inputHash = HashUtil.hashPassword(password); //convertimos a hash el passwd ingresado 

                    return storedHash.equals(inputHash); //comparamos lo hashes 
                }

            } catch (Exception e){
                System.out.println(e.getMessage());
            }

            return false;
        }
    
}
