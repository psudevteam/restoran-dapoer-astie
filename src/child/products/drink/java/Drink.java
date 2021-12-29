package src.child.products.drink.java;

import src.parent.product.java.Product;

public class Drink extends Product {

        private String size;
        public Drink(String name, int price, String size){
                super(name, "Minuman", price);
                this.size = size;
        }

        public void setSize(String newSize){
                this.size = newSize;
        }

        public String getSize(){
                return this.size;
        }

        public void results(){
                System.out.println(getName() + " Rp." + getPrice() + " " + this.getSize());
        }
}
