package src.child.seller.java;

import src.parent.user.java.User;

public class Seller extends User {
    private String name;
    private int quantity;
    private double ballance;

    public Seller(String newName, double newBallance, int newQuantity){
      super(newName, newBallance);
      this.setQuantity(newQuantity);
    }

    public void setQuantity(int newQuantity){
      this.quantity = newQuantity;
    }

    public void increaseQuantity(int amountQuantity){
      this.quantity += amountQuantity;
    }

    public void decreaseQuantity(int amountQuantity){
      this.quantity += amountQuantity;
    }

    public int getQuantity(){
      return this.quantity;
    }
}
