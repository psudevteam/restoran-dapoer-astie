package src.child.users.seller.java;

import src.parent.user.java.User;

public class Seller extends User {
    private String name;
    private int quantity;
    private double ballance;

    public Seller(String newName, double newBallance){
      super(newName, newBallance);
    }
}
