
package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Review {
    private int idReview;       // id resena
    private String comments;    // comentarios
    private int score;          //calificaciones del 1 al 5
    
    //seting time
    LocalDateTime date = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
    String newDate = date.format(formatter);
    
    
    
    public String getDate(){
        return newDate;
    }
    
    
    //setters and getters
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
    
    public int grtScore(){
        return score;
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
    
