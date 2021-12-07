package src.main.java;

import src.product.java.Product;

class Run extends Product {

    public Run(String name){
        super(name, "Makanan", 290000);    
    }

    public static void main(String[] args) {
        Run data = new Run("Seblak Ceker Euy");
        String name = data.getName();
        int harga = data.getPrice();
        System.out.println(name + " " + "Rp." + harga);
    }
}
