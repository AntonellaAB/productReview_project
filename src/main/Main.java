package main;
//import db.conexionDB;

import dao.UserDAO;
import model.User;
import ui.Login;
//import model.User;


public class Main {
   
    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(() -> {
            // 1. Instanciamos la ventana del Login
            Login ventanaLogin = new Login();

            // 2. La hacemos visible en la pantalla
            ventanaLogin.setVisible(true);
        });
        
        /*
        //crear un nuevo usuario

        User user = new User();

        user.setUsername("Anto");
        user.setEmail("Lilostich@gmail.com");
        user.setPassword("hola");

        UserDAO dao = new UserDAO();

        dao.createUser(user); //Le pasa el objeto User al DAO.


        
        //Probar el login 
        UserDAO dao = new UserDAO();
        boolean access = dao.login("Nayeli", "1234");

        System.out.println(access);
        */



    }
}