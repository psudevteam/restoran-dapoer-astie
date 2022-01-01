package src.core.manage.java;

import src.helper.java.Helper;
import src.core.transaction.java.Transaction;
import java.util.Scanner;

public class Manage extends Helper {
  private Transaction data = new Transaction();

  public void manageCustomer(){
    if (data.getCustName() != null){
      this.data.customerData();
    } else {
      Scanner sc = new Scanner(System.in);
      out("Masukkan nama anda : ");
      String newName = sc.nextLine();
      out("Masukkan uang anda : ");
      double newBallance = sc.nextDouble();
      data.setCustName(newName);
      data.setCustBalance(newBallance);
      data.customerData();

    }
  }

  public void manageSeller(){
    this.data.sellerData();
  }

}
