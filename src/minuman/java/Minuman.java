package src.minuman.java;
import src.product.java.Product;

public class Minuman extends Product {

        private String size;
        public Minuman(String name, int price, String size){
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
