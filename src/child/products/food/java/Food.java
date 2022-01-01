package src.child.products.food.java;

import src.parent.product.java.Product;

public class Food extends Product {

  private String variant;

  public Food(String name, int price, String variant, int qty) {
    super(name, "Makanan", price, qty);
    this.setVariant(variant);
  }

  public void setVariant(String newVariant) { this.variant = newVariant; }

  public String getVariant() { return this.variant; }

  public void productInfo() {
    System.out.println(getName() + " " + getVariant() + " Rp." + getPrice() + " ");
  }
}
