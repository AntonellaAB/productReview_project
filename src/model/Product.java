
package model;


public class Product {
    private int idProduct;
    private String name;        //nombre
    private String description; //breve descripcion de que es
    private double price;       //precio
    private String brand;       //marca
    
    
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
    
    
    
    
    //METODOS *******************************************************************
        //mostrar detalles de los productos
    public void showDetails(){
    }
    
    
        //Promedio de las resenas
    public void reviewAverage(){    
    }
    
}


/*
clase Producto: 
atributos: 
    idProducto
    nombre
    description
    precio
    marca
metodos:
    mostrar detalle
    promedio de resenas


*/
