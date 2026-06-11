
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//herramientas JDBC 

public class conexionDB {
    
    private static final String URL = "jdbc:postgresql://localhost:5432/product_review_db";
    //URL - JDBC java Database Connectivity : hay que descargar el driver 

    private static final String USER = "review_app_user";
    private static final String PASSWORD = "h0l4@574rW4r5";


    public static Connection conectar() {
        Connection conn = null; //significa que inicialmente no hay conexion
        try {
            Class.forName("org.postgresql.Driver"); //llama al driver para usarlo 
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conectado a PostgreSQL");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
            }
        return conn;
        }
}




