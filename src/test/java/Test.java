package src.test.java;

import src.makanan.java.Makanan;
import src.minuman.java.Minuman;
import src.product.java.Product;

class Test {

  public static void main(String[] args) {

    System.out.println("\n");

    Makanan seblak = new Makanan("Seblak", 29000, "Pedas Level 2");
    Minuman nutrisari = new Minuman("Nutrisari", 29000, "Besar");
    seblak.results();
    nutrisari.results();

    System.out.println("\n");
    System.out.println("Test Complete with no Error Found");
  }
}
