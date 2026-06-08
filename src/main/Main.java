/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import db.conexionDB;

import dao.UserDAO;
import model.User;
import dao.ReviewDAO;
import model.Review;

public class Main {
    
    public static void main(String[] args) {
        /*/crear un nuevo usuario
        
        User user = new User();
        user.setUsername("Fabrizio");
        user.setEmail("fabriziomazo05@gmail.com");
        user.setPassword("a");

        UserDAO dao = new UserDAO();

        dao.createUser(user); //Le pasa el objeto User al DAO.
        
        
        
        // Probar el login 
        UserDAO dao = new UserDAO();
        boolean access = dao.login("Fabrizio", "a");
        System.out.println(access);
        */
        System.out.println("=== INICIANDO PRUEBA DEL ALGORITMO DE REVIEWS ===");
        
        // 1. Creamos el objeto con datos de prueba
        Review pruebaReview = new Review();
        pruebaReview.setComments("¡Excelente base de datos! Funciona muy rápido de forma local.");
        pruebaReview.setScore(5);

        // SOLUCIÓN: Creamos un usuario ficticio con el ID que queremos guardar
        User usuarioSimulado = new User();
        usuarioSimulado.setIdUser(2); // El ID de usuario que ya existe en tu BD de pgAdmin

        // Le pasamos el usuario a la review
        pruebaReview.setUser(usuarioSimulado); 

        // 2. Instanciamos tu DAO
        ReviewDAO dao = new ReviewDAO();

        // 3. Ejecutamos tu algoritmo de guardado
        boolean resultado = dao.guardarReview(pruebaReview);
        
        // 4. Verificamos la respuesta en la consola de NetBeans
        if (resultado) {
            System.out.println("=== PRUEBA FINALIZADA: Revisa tu pgAdmin para confirmar ===");
        } else {
            System.out.println("=== PRUEBA FALLIDA: Revisa las letras rojas del error ===");
        }
    }
}