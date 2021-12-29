package src.runner.test.java;

import src.helper.java.Helper;
import src.core.manage.java.Manage;


class Test extends Helper {

  public static void main(String[] args) {
    
    Manage manage = new Manage();
    int c = manage.listOptions();
    manage.listFoods(c);


    out("\n");
    out("Test Complete with no Error Found");
  }
}
