/*
Solo vamos a recoger los datos de los productos, no vamos a crear productos nuevos
SELECT id_product, name, description, brand FROM products;
 */
package dao;

import db.conexionDB;
import model.Product;

import java.sql.*; //llamar a todas las herramientaas de sql de una vez
import java.util.ArrayList;
import java.util.List;
import model.Category;

public class ProductDAO {
    // Método para obtener todos los productos
    public List<Product> listProducts() {
        List<Product> productsList = new ArrayList<>();
        
        String SQL = "SELECT id_product, name, description, image_url, price, brand, id_category FROM products";
        
      
        try (Connection conn = conexionDB.conectar(); //Nos conectamos  
            PreparedStatement stmt = conn.prepareStatement(SQL);
            ResultSet rs = stmt.executeQuery();){ //aca recien empieza el try
            
                            
            while (rs.next()) {
                Product prod = new Product(); 
                
                prod.setIdProduct(rs.getInt("id_product"));
                prod.setName(rs.getString("name"));
                prod.setDescription(rs.getString("description"));
                prod.setImageUrl(rs.getString("image_url"));
                prod.setPrice(rs.getDouble("price"));
                prod.setBrand(rs.getString("brand"));
                
                //Nos falta categoria
                Category cat = new Category();
                cat.setIdCategory(rs.getInt("id_category"));
                cat.setName(rs.getString("category_name"));
                cat.setDescription(rs.getString("category_description"));
                
                
                prod.setCategory(cat); //le agrega la categoria al product
                
                productsList.add(prod);    
            }
             
            
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return productsList; // Devolvemos la lista llena
    }
}
