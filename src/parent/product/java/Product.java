package src.parent.product.java;

public abstract class Product {

  // Class Attribute
  private String name, category;
  private int price, qty;

  // Contructor
  public Product(String productName, String productCategory, int productPrice, int productQty) {
    this.setName(productName);
    this.setCategory(productCategory);
    this.setPrice(productPrice);
    this.setQty(productQty);
  }

  // Method Setter Name ( Encapsulation )
  public void setName(String newName) { this.name = newName; }

  // Method Setter Category ( Encapsulation )
  public void setCategory(String newCategory) { this.category = newCategory; }

  // Method Setter Price ( Encapsulation )
  public void setPrice(int newPrice) { this.price = newPrice; }

  // Method Setter Qty ( Encapsulation )
  public void setQty(int newQty) { this.qty = newQty; }

  // Method Setter AddQty ( Encapsulation )
  public void addQty(int amountQty){
    this.qty += amountQty;
  }

  // Method Setter buyProduct ( Encapsulation )
  public void buyProduct(int amountQty){
    this.qty -= amountQty;
  }

  // Method Getter Name ( Encapsulation )
  public String getName() { return this.name; }

  // Method Getter Category ( Encapsulation )
  public String getCategory() { return this.category; }

  // Method Getter Price ( Encapsulation )
  public int getPrice() { return this.price; }

  // Method Getter Price ( Encapsulation )
  public int getQty() { return this.qty; }

  // Overriding the toString() method  
  public String toString(){ return this.name + " Rp." + this.price; }
}
