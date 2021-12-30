package src.runner.test.java;

import src.helper.java.Helper;
import src.core.manage.java.Manage;


class Test extends Helper {

  static int listOptionOne(){
    Manage manage = new Manage();
    int val = manage.listOptions();
    return val;
  }

  static int listOptionTwo(int val){
    Manage manage = new Manage();
    int food = manage.listFoods(val);
    return food;
  }

  static int listOptionThree(int val){
    Manage manage = new Manage();
    int food = manage.listOptionsSelected(val);
    return food;
  }

  static void Menu(int a){

    if (a == 1){
      out("Boom\n");

      Object is = in("Apakah anda ingin menambah Produk yang lain? : ", "String");
      if (is.equals("y") || is.equals("ya") || is.equals("yes")) {

        out("Boom\n");
        Menu(a);

      } else {
        a = listOptionOne();
        Menu(a);

      }

    } else if (a == 2) {
      int b = listOptionTwo(a);
      int c = listOptionThree(b);
      Object is = in("Apakah anda ingin mengedit Produk yang lain? : ", "String");

      if (is.equals("y") || is.equals("ya") || is.equals("yes")) {

        b = listOptionTwo(a);
        c = listOptionThree(b);
        Menu(a);

      } else {
        a = listOptionOne();
        Menu(a);

      }
    }
  }

  public static void main(String[] args) {
    
    int a = listOptionOne();
    Menu(a);

    out("\n");
    out("Test Complete with no Error Found");
  }
}
