package src.core.menu.java;

import src.core.manage.java.Manage;
import src.helper.java.Helper;
import java.util.Scanner;

public class Menu extends Helper {
  public Menu() {
    Scanner sc =  new Scanner(System.in);

    Manage data = new Manage();
    String[] listMenu = {"Penjual", "Pembeli", "Keluar"};
    list(listMenu);
    out("Silahkan Pilih : ");
    int newSelect = sc.nextInt();

    if (newSelect == 1){
      data.manageSeller();
    } 

    else if ( newSelect == 2){
      data.manageCustomer();
    }

    else {
      out("Terimkasih");
    }
  }
}
