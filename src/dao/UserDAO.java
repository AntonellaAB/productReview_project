
package dao;

import db.conexionDB; //comunique con la bd
import model.User;
import utils.HashUtil;
import java.sql.*;       

public class UserDAO {
    //METODO PARA CREAR USUARIOS
    public void createUser(User user){ //user es un tipo de dato
        
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

        } catch(Exception e) {

            System.out.println(e.getMessage());
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
