
package model;

public class Category {
    private int idCategory;
    private String name;
    private String description;


    //Getters and Setters
    public void setIdCategory(int id){
        this.idCategory = id;
    }
    
    public int getIdCategory(){
        return idCategory;
    }
    
    
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
        
    
    
    public void setDescription(String description){
        this.description = description;
    }
    
    public String getDescription(){
        return description;
    }

}

