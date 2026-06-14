
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
import java.util.List;
import java.util.ArrayList;
import model.User;

public class ReviewDAO {

    /**
     * Inserta una reseña real en la base de datos de PostgreSQL
     */
    public boolean guardarReview(Review nuevaReview) {
        // Tu consulta SQL para insertar datos (los nombres de columnas deben coincidir con tu DB)
        String sql = "INSERT INTO reviews (comment, score, review_date, id_user, id_product) VALUES (?, ?, ?::timestamp, ?, ?)";

        // Intentamos conectarnos y ejecutar la consulta
        try (Connection con = conexionDB.conectar(); PreparedStatement ps = con.prepareStatement(sql)) {

            // Reemplazamos los signos de interrogación (?) con los datos del objeto Review
            ps.setString(1, nuevaReview.getComments());
            ps.setInt(2, nuevaReview.getScore());
            ps.setString(3, nuevaReview.getDate()); // Pasamos la fecha formateada
            // PEGA ESTA LÍNEA EN SU LUGAR:
            ps.setInt(4, nuevaReview.getUser().getIdUser()); // Pasamos el ID del usuario
            ps.setInt(5, nuevaReview.getIdProduct()); // <- AGREGA ESTA LÍNEA
            //ps.setInt(5, nuevaReview.getProducto().getIdProduct());

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

        return false; // Si llegó aquí, algo falló (Esto es tu línea 54)
    } // <- ESTA ES TU LÍNEA 55 (Aquí cierra guardarReview)

    // 👇 AQUÍ PONES EL NUEVO MÉTODO (Con 4 espacios de sangría hacia la derecha)
    public List<Review> obtenerReviewsPorProducto(int idProducto) {
        List<Review> lista = new ArrayList<>();
        // Buscamos los datos de la reseña y el nombre del usuario conectado
        String sql = "SELECT r.id_review, u.name, r.comment, r.score "
                + "FROM reviews r "
                + "JOIN users u ON r.id_user = u.id_user "
                + "WHERE r.id_product = ?";

        try (Connection con = conexionDB.conectar(); PreparedStatement ps = con.prepareStatement(sql)) {

            // 1. Reemplazamos el "?" con el ID del producto que queremos consultar
            ps.setInt(1, idProducto);

            // 2. Ejecutamos la consulta y el resultado se guarda en 'rs' (nuestro Excel virtual)
            try (java.sql.ResultSet rs = ps.executeQuery()) {

                // 3. El while dice: "Mientras haya una fila siguiente en el Excel, haz esto..."
                while (rs.next()) {
                    Review r = new Review();

                    // Sacamos los datos de las columnas de la BD y los guardamos en el objeto Review
                    r.setComments(rs.getString("comment"));
                    r.setScore(rs.getInt("score"));

                    // Nota: Si tu clase Review tiene un set para el id_review, puedes activar la línea de abajo:
                    r.setIdReview(rs.getInt("id_review"));
                    // Como la consulta nos trae el NOMBRE del usuario, creamos un objeto User temporal
                    User u = new User();
                    u.setUsername(rs.getString("name")); // Sacamos el nombre de la columna 'name'

                    // Metemos ese usuario dentro de la reseña (recuerda que tu Review conoce al User)
                    r.setUser(u);

                    // Finalmente, guardamos esta reseña ya armada en la lista
                    lista.add(r);
                }
            }

        } catch (SQLException e) {
            System.out.println("[ERROR SQL] Error al leer las reseñas: " + e.getMessage());
        }
        // 👆 HASTA AQUÍ

        return lista;
    }
}
