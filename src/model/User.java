
package model;


public class User {
    private int idUser;             // identificador id de usuario
    private String username;        //nombre de usuario
    private String password;        //contrasena
    
    
    //setters y getters de cada uno ************************************************
    public void setIdUser(int id){
        this.idUser = id; 
    }
    
    public int getIdUser(){
        return idUser;
    }
    
    
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public String getUsername(){
        return username;
    }
    
    
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getPassword(){
        return password;
    }
    
    
    
    
    //METODOS *******************************************************************
    public void logIn(){
    }
    
    
    public void writeReview(){
    }
    
    
    public void editReview(){
    }
    
}

/*
Clase Usuario
atributos:
    id  
    nombre
    contrasena

metodos:
    iniciar sesion - login
    escribir resena
    editar resena

*/
