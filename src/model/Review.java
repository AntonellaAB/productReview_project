package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Review {
    private int idReview;       // id resena
    private String comments;    // comentarios
    private int score;          // calificaciones del 1 al 5
    private User user;          // <--- NUEVO: Relación con el usuario
    
    // setting time
    LocalDateTime date = LocalDateTime.now();
    // Ajustado al formato estándar de PostgreSQL
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    String newDate = date.format(formatter);
    
    public String getDate(){
        return newDate;
    }
    
    // setters and getters
    public void setIdReview(int id){
        this.idReview = id;
    }
    
    public int getIdReview(){
        return idReview;
    }
    
    public void setComments(String comments){
        this.comments = comments;
    }
    
    public String getComments(){
        return comments;
    }
    
    public void setScore(int score){
        this.score = score;
    }
    
    public int getScore(){
        return score;
    }

    // <--- NUEVOS: Métodos para conectar con ReviewDAO
    public void setUser(User user){
        this.user = user;
    }
    
    public User getUser(){
        return user;
    }
}

/*
clase de resena (REVIEW)
atributos :
    idReview
    comentarios 
    calificaciones
    fecha: DATE
*/
    
