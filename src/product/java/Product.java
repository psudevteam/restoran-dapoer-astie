package src.product.java;

public abstract class Product {
        
    // Class Attribute    
    private String name, category;     
    private int price;

    // Contructor
    public Product(String productName, String productCategory, int productPrice){
        this.setName(productName);    
        this.setCategory(productCategory);    
        this.setPrice(productPrice);    
    }

    // Method Setter Name ( Encapsulation )
    public void setName(String newName){
        this.name = newName;
    }

    // Method Setter Category ( Encapsulation )
    public void setCategory(String newCategory){
        this.category = newCategory;
    }

    // Method Setter Price ( Encapsulation )
    public void setPrice(int newPrice){
        this.price = newPrice;
    }

    // Method Getter Name ( Encapsulation )
    public String getName(){
        return this.name;
    }

    // Method Getter Category ( Encapsulation )
    public String getCategory(){
        return this.category;
    }

    // Method Getter Price ( Encapsulation )
    public int getPrice(){
        return this.price;
    }
}
