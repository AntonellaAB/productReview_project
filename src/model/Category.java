package model;

public class Category {

    private int idCategory;
    private String name;
    private String description;

    public Category() {
    }

    public Category(int id, String name, String description) {
        this.idCategory = id;
        this.name = name;
        this.description = description;
    }

    public Category(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void setIdCategory(int id) {
        this.idCategory = id;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return name;
    }
}