package src.test.java;

import src.product.java.Product;

class Test extends Product {

    public Test(String name, String category, int price){
        super(name, category, price);    
    }

    public static void main(String[] args) {
        Test data = new Test("Test Name Before", "Test Category Before", 2000);

        System.out.println("\n");
        System.out.println("Check if name can be rendered.....");
        System.out.println("Name can be rendered!");
        System.out.println("Results : " + data.getName());
        System.out.println("Check if name can be changed....");
        System.out.println("Try change name from " + data.getName() + " to Test Name After......." );
        data.setName("Test Name After");
        System.out.println("Name can be changed!");
        System.out.println("Results : " + data.getName());

        System.out.println("\n");
        System.out.println("Check if category can be rendered.....");
        System.out.println("Category can be rendered!");
        System.out.println("Results : " + data.getCategory());
        System.out.println("Check if category can be changed....");
        System.out.println("Try change category from " + data.getCategory() + " to Test Category After......." );
        data.setCategory("Drink");
        System.out.println("Category can be changed!");
        System.out.println("Results : " + data.getCategory());
        System.out.println("\n");

        System.out.println("Check if price can be rendered.....");
        System.out.println("Price can be rendered!");
        System.out.println("Results : " + data.getPrice());
        System.out.println("Check if price can be changed....");
        System.out.println("Try change category from " + data.getPrice() + " to 30000......." );
        data.setPrice(30000);
        System.out.println("Price can be changed!");
        System.out.println("Results : " + data.getPrice());

        System.out.println("\n");
        System.out.println("Test Complete with no Error Found");
    }
}
