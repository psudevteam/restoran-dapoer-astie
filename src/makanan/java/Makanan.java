package src.makanan.java;

import java.util.Scanner;
import src.product.java.Product;

public class Makanan extends Product {

  private String variant;

  public Makanan(String name, int price, String variant) {
    super(name, "Makanan", price);
    this.setVariant(variant);
  }

  public void setVariant(String newVariant) { this.variant = newVariant; }

  public String getVariant() { return this.variant; }

  public void results() {
    System.out.println(getName() + " Rp." + getPrice() + " " + getVariant());
  }
}
