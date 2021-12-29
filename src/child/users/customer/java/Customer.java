package src.child.customer.java;

import src.parent.user.java.User;
import src.helper.java.Helper;

public class Customer extends User{
    private String[] cart;
    public Customer(String newName, double newBallance, String[] newCart){
      super(newName, newBallance);
      this.setCart(newCart);
    }

    public void setCart(String[] newCart){
      this.cart = newCart;
    }

    public void getCart(){
     String currentCart;
     for (int i = 0; i < this.cart.length; ++i){
        currentCart = this.cart[i];
        System.out.println(currentCart + "");
      }
    }
}
