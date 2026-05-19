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

        User user = new User();

        user.setUsername("Antonella");
        user.setEmail("antonella@gmail.com");
        user.setPassword("1234");

        UserDAO dao = new UserDAO();

        dao.createUser(user); //Le pasa el objeto User al DAO.

    }
}