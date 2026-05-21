
package model;


public class Product {
    private int idProduct;
    private String name;        //nombre
    private String description; //breve descripcion de que es
    private String imageUrl;
    private double price;       //precio
    private String brand;       //marca
    private Category category;
    
    
    //Getters y setters 
    
    public void setIdProduct(int id){
        this.idProduct = id;
    }
    
    public int getIdProduct(){
        return idProduct;
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
    
    
    public void setImageUrl(String image){
        this.imageUrl = image;
    }
    
    public String getImageUrl(){
        return imageUrl;
    }
    
    
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public double getPrice(){
        return price;
    }
    
    
    
    public void setBrand(String brand){
        this.brand = brand;
    }
    
    
    public String getBrand(){
        return brand;
    }
    
    // CATEGORY

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
    
    
}

