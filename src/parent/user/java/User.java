package src.parent.user.java;

public abstract class User {

  // Class Attribute
  private String name;
  private double ballance;

  // Contructor
  public User(String UserName,  double UserBalance) {
    this.setName(UserName);
    this.setBallance(UserBalance);
  }

  // Method Setter Name ( Encapsulation )
  public void setName(String newName) { this.name = newName; }

    // Method Setter Ballance ( Encapsulation )
  public void setBallance(double newBallance) { this.ballance = newBallance; }

  // Method Getter Name ( Encapsulation )
  public String getName() { return this.name; }

    // Method Getter Ballance ( Encapsulation )
  public double getBallance() { return this.ballance; }
}
