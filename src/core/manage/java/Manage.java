package src.core.manage.java;

import src.child.products.food.java.Food;
import src.child.products.drink.java.Drink;
import src.helper.java.Helper;

public class Manage extends Helper {

    public int listOptions(){
      String[] listOptions = {"Tambah Makanan", "Lihat Daftar Makanan", "Keluar"};
      list(listOptions);
      Object z = in("Silahkan Pilih : ", "Integer");
      return toInt(z);
    }

    public static void listFoods(int val){

      Food food[] = {
        new Food("Nasi Goreng Pecel", 20000, "Original"),
        new Food("Soto Ayam", 25000, "Original"),
        new Food("Tongseng Kambing", 35000, "Original"),
        new Food("Steak Wagyu Sherloin Grade A5", 1305000, "Original")
      };
      
      if (val == 2){
        list(food);
        Object x = in("Silahkan Pilih : ", "Integer");
        out("\nBerhasil memilih " + food[toInt(x) - 1].getName() + "\n");
      
        String[] listOptionsSelected = {"Lihat Makanan", "Edit Makanan", "Hapus Makanan", "Keluar"};
        list(listOptionsSelected);
        Object y = in("Silahkan Pilih : ", "Integer");
      
        if (toInt(y) == 1){
          food[toInt(x) - 1].results();
        }

      }

    }
}
