package test.java;

import product.java.MainProduct;

class MainTest extends MainProduct {

    public MainTest(String name){
        super(name, "Makanan", 290000);    
    }

    public static void main(String[] args) {
        MainTest data = new MainTest("Seblak Ceker");
        String name = data.getName();
        System.out.println(name);
    }
}
