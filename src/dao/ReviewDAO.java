
/*
metodos: 
    publicar()
    edit()
    eliminar()

*/


package dao;

import db.conexionDB; // Tu clase de conexión
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Review;
import model.User;

public class ReviewDAO {

    /**
     * Inserta una reseña real en la base de datos de PostgreSQL
     */
    public boolean guardarReview(Review nuevaReview) {
        // Tu consulta SQL para insertar datos (los nombres de columnas deben coincidir con tu DB)
        String sql = "INSERT INTO reviews (comment, score, review_date, id_user) VALUES (?, ?, ?::timestamp, ?)";
        
        // Intentamos conectarnos y ejecutar la consulta
        try (Connection con = conexionDB.conectar(); 
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            // Reemplazamos los signos de interrogación (?) con los datos del objeto Review
            ps.setString(1, nuevaReview.getComments());
            ps.setInt(2, nuevaReview.getScore());
            ps.setString(3, nuevaReview.getDate()); // Pasamos la fecha formateada
            // PEGA ESTA LÍNEA EN SU LUGAR:
            ps.setInt(4, nuevaReview.getUser().getIdUser()); // Pasamos el ID del usuario
            
            // Ejecutamos la orden en la base de datos
            int filasAfectadas = ps.executeUpdate();
            
            if (filasAfectadas > 0) {
                System.out.println("[ÉXITO] ¡La reseña se guardó correctamente en PostgreSQL!");
                return true;
            }
            
        } catch (SQLException e) {
            System.out.println("[ERROR SQL] Error al insertar en la base de datos: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("[ERROR GENERAL] Ocurrió un problema inesperado: " + e.getMessage());
        }
        
        return false; // Si llegó aquí, algo falló
    }
}