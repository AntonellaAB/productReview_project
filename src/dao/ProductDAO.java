package dao;

import db.conexionDB;
import model.Product;

import java.sql.*; 
import java.util.ArrayList;
import java.util.List;
import model.Category;

public class ProductDAO {
    // Método para obtener todos los productos
    public List<Product> listProducts() {
        List<Product> productsList = new ArrayList<>();
        
        String SQL = """
            SELECT 
                p.id_product,
                p.name,
                p.description,
                p.image_url,
                p.price,
                p.brand,
                p.id_category,
                c.name AS category_name,
                c.description AS category_description,
                COALESCE(ROUND(AVG(r.score), 2), 0) AS average_score
            FROM products p
            LEFT JOIN categories c
                ON p.id_category = c.id_category
            LEFT JOIN reviews r
                ON p.id_product = r.id_product
            GROUP BY 
                p.id_product,
                p.name,
                p.description,
                p.image_url,
                p.price,
                p.brand,
                p.id_category,
                c.name,
                c.description
            ORDER BY p.id_product
        """;
        
      
        try (Connection conn = conexionDB.conectar(); 
            PreparedStatement stmt = conn.prepareStatement(SQL);
            ResultSet rs = stmt.executeQuery();){ 
            
                            
            while (rs.next()) {
                Product prod = new Product(); 
                
                prod.setIdProduct(rs.getInt("id_product"));
                prod.setName(rs.getString("name"));
                prod.setDescription(rs.getString("description"));
                prod.setImageUrl(rs.getString("image_url"));
                prod.setPrice(rs.getDouble("price"));
                prod.setBrand(rs.getString("brand"));
                Category cat = new Category();
                cat.setIdCategory(rs.getInt("id_category"));
                cat.setName(rs.getString("category_name"));
                cat.setDescription(rs.getString("category_description"));
                prod.setAverageScore(rs.getDouble("average_score"));
                
                
                prod.setCategory(cat);
                
                productsList.add(prod);    
            }
             
            
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return productsList;
    }
    //listar productos por categoria
    public List<Product> listProductsByCategory(int idCategory) {
        List<Product> productsList = new ArrayList<>();

        String SQL = """
            SELECT 
                p.id_product,
                p.name,
                p.description,
                p.image_url,
                p.price,
                p.brand,
                p.id_category,
                c.name AS category_name,
                c.description AS category_description,
                COALESCE(ROUND(AVG(r.score), 2), 0) AS average_score
            FROM products p
            LEFT JOIN categories c
                ON p.id_category = c.id_category
            LEFT JOIN reviews r
                ON p.id_product = r.id_product
            WHERE p.id_category = ?
            GROUP BY 
                p.id_product,
                p.name,
                p.description,
                p.image_url,
                p.price,
                p.brand,
                p.id_category,
                c.name,
                c.description
            ORDER BY p.id_product
        """;

        try (
            Connection conn = conexionDB.conectar();
            PreparedStatement stmt = conn.prepareStatement(SQL);
        ) {

            stmt.setInt(1, idCategory);

            try (ResultSet rs = stmt.executeQuery()) {

                while (rs.next()) {
                    Product prod = new Product();

                    prod.setIdProduct(rs.getInt("id_product"));
                    prod.setName(rs.getString("name"));
                    prod.setDescription(rs.getString("description"));
                    prod.setImageUrl(rs.getString("image_url"));
                    prod.setPrice(rs.getDouble("price"));
                    prod.setBrand(rs.getString("brand"));

                    Category cat = new Category();
                    cat.setIdCategory(rs.getInt("id_category"));
                    cat.setName(rs.getString("category_name"));
                    cat.setDescription(rs.getString("category_description"));
                    prod.setAverageScore(rs.getDouble("average_score"));

                    prod.setCategory(cat);

                    productsList.add(prod);
                }
            }

        } catch (Exception e) {
            System.out.println("Error al listar productos por categoría: " + e.getMessage());
        }

        return productsList;
    }
    public Product getProductById(int idProduct) {
        String SQL = """
            SELECT 
                p.id_product,
                p.name,
                p.description,
                p.image_url,
                p.price,
                p.brand,
                p.id_category,
                c.name AS category_name,
                c.description AS category_description
            FROM products p
            LEFT JOIN categories c
                ON p.id_category = c.id_category
            WHERE p.id_product = ?
        """;

        try (
            Connection conn = conexionDB.conectar();
            PreparedStatement stmt = conn.prepareStatement(SQL)
        ) {
            stmt.setInt(1, idProduct);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    Product prod = new Product();

                    prod.setIdProduct(rs.getInt("id_product"));
                    prod.setName(rs.getString("name"));
                    prod.setDescription(rs.getString("description"));
                    prod.setImageUrl(rs.getString("image_url"));
                    prod.setPrice(rs.getDouble("price"));
                    prod.setBrand(rs.getString("brand"));

                    Category cat = new Category();
                    cat.setIdCategory(rs.getInt("id_category"));
                    cat.setName(rs.getString("category_name"));
                    cat.setDescription(rs.getString("category_description"));

                    prod.setCategory(cat);

                    return prod;
                }
            }

        } catch (Exception e) {
            System.out.println("Error al buscar producto por ID: " + e.getMessage());
        }

        return null;
    }
}
