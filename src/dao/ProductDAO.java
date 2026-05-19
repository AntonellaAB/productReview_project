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

public class ProductDAO {
    // Método para obtener todos los productos
    public List<Product> listProducts() {
        List<Product> productsList = new ArrayList<>();
        
        String SQL = "SELECT id_product, name, description, price, brand FROM products";
        
      
        try (Connection conn = conexionDB.conectar(); //Nos conectamos  
            PreparedStatement stmt = conn.prepareStatement(SQL);
            ResultSet rs = stmt.executeQuery();){ //aca recien empieza el try
            
                            
            while (rs.next()) {
                Product prod = new Product(); 
                
                prod.setIdProduct(rs.getInt("id_product"));
                prod.setName(rs.getString("name"));
                prod.setDescription(rs.getString("description"));
                prod.setPrice(rs.getDouble("price"));
                prod.setBrand(rs.getString("brand"));
                
                productsList.add(prod);    
            }
             
            
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return productsList; // Devolvemos la lista llena
    }
}
