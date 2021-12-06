package src.test.java;

import src.product.java.Product;

class Test extends Product {

    public Test(String name){
        super(name, "Makanan", 290000);    
    }

    public static void main(String[] args) {
        Test data = new Test("Test Name Before");

        // Cek if name can be renderd with methods getters
        System.out.println("Results : " + data.getName());

        // Cek if name can be changed with methods setters
        data.setName("Test Name After");
        System.out.println("Results : " + data.getName());

        System.out.println("Test Complete with no Error Found");
    }
}
