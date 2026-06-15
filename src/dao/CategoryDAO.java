
package dao;

import db.conexionDB;
import model.Category;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoryDAO {

    // LISTAR CATEGORIAS

    public List<Category> listCategories() {

        List<Category> categories = new ArrayList<>();

        String SQL = "SELECT id_category, name, description FROM categories ORDER BY id_category";

        try (
            Connection conn = conexionDB.conectar();
            PreparedStatement stmt =
                conn.prepareStatement(SQL);
            ResultSet rs = stmt.executeQuery();) {

            while(rs.next()) {

                Category cat = new Category();

                cat.setIdCategory(rs.getInt("id_category"));
                cat.setName(rs.getString("name"));
                cat.setDescription(rs.getString("description"));

                categories.add(cat);
            }

        } catch(Exception e) {

            System.out.println(e.getMessage());

        }

        return categories;
    }
    public boolean addCategory(Category category) {
        String sql = "INSERT INTO categories (name, description) VALUES (?, ?)";

        try (
            Connection conn = conexionDB.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)
        ) {
            stmt.setString(1, category.getName());
            stmt.setString(2, category.getDescription());

            return stmt.executeUpdate() > 0;

        } catch (Exception e) {
            System.out.println("Error al agregar categoría: " + e.getMessage());
            return false;
        }
    }
}