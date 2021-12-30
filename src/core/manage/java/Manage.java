package src.core.manage.java;

import src.child.products.food.java.Food;
import src.child.products.drink.java.Drink;
import src.helper.java.Helper;
import src.database.java.Database;

public class Manage extends Helper {

    public int listOptions() {

      String[] listOptions = {"Tambah Makanan", "Lihat Daftar Makanan", "Keluar"};
      list(listOptions);
      Object z = in("Silahkan Pilih : ", "Integer");
      return toInt(z);

    }

    public int listFoods(int val){

      Database data = new Database();
      
        list(data.getFoodData());
        Object x = in("Silahkan Pilih : ", "Integer");
        out("\nBerhasil memilih " + data.getFoodData()[toInt(x) - 1].getName() + "\n");

      return toInt(x);

    }

    public int listOptionsSelected(int val) {

      Database data = new Database();

        String[] listOptionsSelected = {"Lihat Makanan", "Edit Makanan", "Hapus Makanan", "Keluar"};
        list(listOptionsSelected);
        Object y = in("Silahkan Pilih : ", "Integer");
      
        if (toInt(y) == 1){
          data.getFoodData()[val - 1].results();
        }

        else if (toInt(y) == 2) {
          out("Data Sebelum Di Edit");
          out("\nNama : " + data.getFoodData()[val - 1].getName());
          out("\nHarga : " + data.getFoodData()[val - 1].getPrice() + "\n");
          out("Variant : " + data.getFoodData()[val - 1].getVariant() + "\n");

          Object newName = in("Masukkan Nama Baru : ", "String");
          Object newPrice = in("Masukkan Harga Baru : ", "Integer");
          Object newVariant = in("Masukkan Variant Baru : ", "String");

          data.getFoodData()[val - 1].setName(toStr(newName));
          data.getFoodData()[val - 1].setPrice(toInt(newPrice));
          data.getFoodData()[val - 1].setVariant(toStr(newVariant));

          out("Data Sesudah Di Edit");
          out("\nNama : " + data.getFoodData()[val - 1].getName());                   
          out("\nHarga : " + data.getFoodData()[val - 1].getPrice() + "\n");
          out("Variant : " + data.getFoodData()[val - 1].getVariant() + "\n");
        }

        return toInt(y);

    }

}
