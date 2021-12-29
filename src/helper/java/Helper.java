package src.helper.java;

import java.util.Scanner;

public class Helper {


    public static void out(Object newData){
      System.out.print(newData);
    }

    public static int toInt(Object newData){
      return Integer.valueOf((Integer)newData);
    }

    public static String toStr(Object newData){
      return String.valueOf(newData);
    }

    public static void list(Object[] newList){
      for (int i = 0; i < newList.length; ++i){
        int k = i + 1;
        out(k + "." + newList[i] + "\n");
      }
    }

    public static Object in(String newPlaceholder, Object newVal){

        Scanner i = new Scanner(System.in);
        if (newVal.equals("String")){
          out("\n" + newPlaceholder);
          newVal = i.nextLine();
        }

        else if (newVal.equals("Integer")){
          out("\n" + newPlaceholder);
          newVal = i.nextInt();
        }

        return newVal;

    }

}
