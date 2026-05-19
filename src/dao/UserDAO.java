/*
Este archivo habla con la tabla de usuarios
aqui debe ir el createUser()
 */
package dao;
import db.conexionDB;
import model.User;

import java.sql.*;       

public class UserDAO {
    //METODO PARA CREAR USUARIOS
    public void createUser(User user){ //user es un tipo de dato
        
        String SQL = "iNSERT INTO users(username, email, password) VALUES (?, ?, ?)"; //LOS ? SON PLACEHOLDERS
        try (Connection conn = conexionDB.conectar(); //Nos conectamos  
            PreparedStatement stmt = conn.prepareStatement(SQL);){ 
            
            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getPassword());

            stmt.executeUpdate();

            System.out.println("Usuario creado");

        } catch(Exception e) {

            System.out.println(e.getMessage());
        }
    }
    
    
    //METODO PARA ACCEDER A LOS USUARIOS - mostrar los usuarios
    
}
