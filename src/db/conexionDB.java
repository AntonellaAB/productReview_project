/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class conexionDB {
    
    private static final String URL = "jdbc:postgresql://localhost:5432/product_review_bd";
    private static final String USER = "USERDB";
    private static final String PASSWORD = "PASSWORDDB";

    public static Connection conectar() {
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conectado a PostgreSQL");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
            }
        return conn;
        }
}




