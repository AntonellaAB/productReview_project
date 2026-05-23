/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import db.conexionDB;

import dao.UserDAO;

import model.User;

public class Main {
    
    public static void main(String[] args) {
        /*crear un nuevo usuario
        
        User user = new User();

        user.setUsername("Nayeli");
        user.setEmail("NayeliB@gmail.com");
        user.setPassword("1234");

        UserDAO dao = new UserDAO();

        dao.createUser(user); //Le pasa el objeto User al DAO.
        */
        
        
        //Probar el login 
        UserDAO dao = new UserDAO();
        boolean access = dao.login("Nayeli", "1234");

        System.out.println(access);

    }
}