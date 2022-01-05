package src.core.transaction.java;

import src.helper.java.Helper;
import src.core.menu.java.Menu;
import src.child.users.customer.java.Customer;
import src.child.products.food.java.Food;
import src.child.products.drink.java.Drink;
import java.util.*;

public class Transaction extends Helper {

  private ArrayList<Food> foodData = new ArrayList<Food>();
  private ArrayList<Drink> drinkData = new ArrayList<Drink>();
  private double custBallance, newBallance;
  private String newName, custName;
  private ArrayList<String> newCart = new ArrayList<String>();
  private ArrayList<Integer> value = new ArrayList<Integer>();
  private ArrayList<Integer> index = new ArrayList<Integer>();

  public Transaction(){
    Food food1 = new Food("Nasi Goreng Jawa", 290000, "Original", 10);
    Food food2 = new Food("Kwetiaw China", 490000, "Original", 10);
    foodData.add(food1);
    foodData.add(food2);

    Drink drink1 = new Drink("Jus Buah Khuldi", 8000, "Small", 10);
    Drink drink2 = new Drink("Es Campur Majalaya", 10000, "Small", 10);
    drinkData.add(drink1);
    drinkData.add(drink2);

    Customer cust = new Customer(this.newName, this.newBallance);
    this.custName = cust.getName();
    this.custBallance = cust.getBallance();
  }

  public void setCustName(String newName){
    this.newName = newName;
  }

  public void setCustBalance(double newBalance){
    this.newBallance = newBalance;
  }

  public String getCustName(){
    return this.custName;
  }

  public double getCustBallance(){
    return this.custBallance;
  }

  public double totalBallance(){
    double totalFood = 0;
    double totalDrink = 0;
    double total = 0;
    for (int i = 0; i < this.foodData.size(); ++i){
      totalFood = this.foodData.get(i).getQty() * this.foodData.get(i).getPrice();
    }
    for (int j = 0; j < this.drinkData.size(); ++j){
      totalDrink = this.drinkData.get(j).getQty() * this.drinkData.get(j).getPrice();
    }

    total = totalFood + totalDrink;

    return total;
  }

  public void addProduct(String type, String newName, int newPrice, String newVariant, int qty){
    if (type.equals("Food")){
      Food newFood = new Food(newName, newPrice, newVariant, qty);
      this.foodData.add(newFood);
    }

    else if (type.equals("Drink")){
      Drink newDrink = new Drink(newName, newPrice, newVariant, qty);
      this.drinkData.add(newDrink);
    }
  }

  public void editProduct(String type, int val, String newName, int newPrice, String newVariant){
    if (type.equals("Food")){
      this.foodData.get(val).setName(newName);
      this.foodData.get(val).setPrice(newPrice);
      this.foodData.get(val).setVariant(newVariant);
    }

    else if(type.equals("Drink")){
      this.drinkData.get(val).setName(newName);
      this.drinkData.get(val).setPrice(newPrice);
      this.drinkData.get(val).setSize(newVariant);
    }
  }

  public void deleteProduct(String type, int val){
    if (type.equals("Food")){
      this.foodData.remove(val);
    }
    else if (type.equals("Drink")){
      this.drinkData.remove(val);
    }
  }

  public void getProduct(String type, int val){

    if (type.equals("Food")){
     this.foodData.get(val);
    }

    else if (type.equals("Drink")){
     this.drinkData.get(val);
    }
  }

 public void setFoodVariant(int num, String val){
   this.foodData.get(num).setVariant(val);
 }

 public void setDrinkSize(int num, String val){
   this.drinkData.get(num).setSize(val);
 }

 public void buyProduct(String type, int num, int val){
   if (type.equals("Food")){
    this.foodData.get(num).buyProduct(val);
   }

   else if (type.equals("Drink")){
    this.drinkData.get(num).buyProduct(val);
   }
 }

 public void addFoodQty(int num, int val){
   this.foodData.get(num).addQty(val);
 }

 public void addDrinkQty(int num, int val){
   this.drinkData.get(num).addQty(val);
 }

 public int countFood(){
   return this.foodData.size();
 }

  public int countDrink(){
    return this.drinkData.size();
  }

 public void listFood(){
   for (int i = 0; i < this.countFood(); ++i){
     out(i+1 + "." + this.foodData.get(i) + "\n");
   }
 }

 public void listFoodView(){
   for (int i = 0; i < this.countFood(); ++i){
     out(i+1 + "." + this.foodData.get(i) + " Stok " + this.foodData.get(i).getQty() + "\n");
   }
 }

  public void listDrink(){
    for (int i = 0; i < this.countDrink(); ++i){
      out(i+1 + "." + this.drinkData.get(i) + "\n");
    }
  }

  public void listDrinkView(){
    for (int i = 0; i < this.countDrink(); ++i){
      out(i+1 + "." + this.drinkData.get(i) + " Stok " + this.drinkData.get(i).getQty() + "\n");
    }
  }

  public int inputInt(String val){
    Scanner sc = new Scanner(System.in);
    out(val);
    int num = sc.nextInt();
    return num;
  }

  public double inputDou(String val){
    Scanner sc = new Scanner(System.in);
    out(val);
    double num = sc.nextDouble();
    return num;
  }

  public String inputStr(String val){
    Scanner sc = new Scanner(System.in);
    out(val);
    String num = sc.nextLine();
    return num;
  }

  public static String removeTillWord(String input, String word) {
    return input.substring(input.indexOf(word));
  }

  public void listCart(){
    String tot = "";
    double b = 0;
    for (int i = 0; i < this.newCart.size(); ++i){
       out(i+1 + "." + this.newCart.get(i) + " Jumlah " + this.value.get(i) + "\n");
       out(this.newCart.get(i).substring(this.newCart.get(i).lastIndexOf("Rp.") + 3));
       b = Double.parseDouble(tot);
      }
    out("Anda harus membayar sebesar : " + b);
    out("\n");
  }

  public void customerData(){
     out("Hallo " + this.getCustName() + " Selamat Datang di Restoran Dapoer Astie \n");
     String[] productCategory = {"Makanan", "Minuman", "Bayar", "Lihat Keranjang", "Kembali Ke Menu Sebelumnya"};
     list(productCategory);
     int choicesProductCategoty = this.inputInt("Silahkan Pilih : ");
     if (choicesProductCategoty == 1){
       this.listFood();
       int c = this.inputInt("Silahkan Pilih : ");
       int choicesFood = c - 1;
       int q = this.inputInt("Masukkan Jumlah Pemesanan : ");
       if ( this.foodData.get(choicesFood).getQty() == 0 ) {
         out("Produk Kehabisan Stok \n");
         String p = inputStr("Apakah anda ingin lanjut? : \n");
         if (p.equals("y") || p.equals("ya") || p.equals("yes")){
           this.customerData();
          } else {
            this.customerData();
          }
        }
      else if(this.foodData.get(choicesFood).getQty() < q){
          out("Stok Tidak Cukup \n");
          String p = inputStr("Apakah anda ingin lanjut? : ");
          if (p.equals("y") || p.equals("ya") || p.equals("yes")){
            this.customerData();
           } else {
             this.customerData();
           }
        }
      else {
          int newVal = new Integer(q);
          int newInd = new Integer(choicesFood);
          value.add(newVal);
          index.add(newInd);
          this.buyProduct("Food", choicesFood, q);
          String cart1 = new String(toStr(this.foodData.get(choicesFood)));
          newCart.add(cart1);
          out("Berhasil Memasukkan " + q + " " + this.foodData.get(choicesFood) + " Ke Keranjang \n");
          String p = inputStr("Apakah anda ingin lanjut? : ");
         if (p.equals("y") || p.equals("ya") || p.equals("yes")){
           this.customerData();
         } else {
            this.customerData();
         }
      } 
     }
     else if (choicesProductCategoty == 2){
       this.listDrink();
       int c = this.inputInt("Silahkan Pilih : ");
       int choicesDrink = c - 1;
       out("Berhasil Memasukkan Ke Keranjang " + this.drinkData.get(choicesDrink));
       String p = inputStr("Apakah anda ingin lanjut? : ");
       if (p.equals("y") || p.equals("ya") || p.equals("yes")){
         this.customerData();
       } else {
          this.customerData();
       }
     } 
     else if (choicesProductCategoty == 3) {
       out("\n Bayar Gaes \n");
       String p = inputStr("Apakah anda ingin lanjut? : ");
       if (p.equals("y") || p.equals("ya") || p.equals("yes")){
         this.customerData();
       } else {
          this.customerData();
       }
     }
     else if(choicesProductCategoty == 4){
       out("Daftar Keranjang \n");
       this.listCart();
       String p = inputStr("Apakah anda ingin lanjut? : ");
          if (p.equals("y") || p.equals("ya") || p.equals("yes")){
            this.customerData();
           } else {
             Menu data = new Menu();
        }
     } else {
       Menu data = new Menu();
     } 
  }

  public void sellerData(){
    String[] listMenu = {"Tambah Stok", "Edit Data Produk", "Lihat Semua Produk", "Kembali ke Menu Sebelumnya"};
    String[] listTypeProduct = {"Makanan", "Minuman", "Kembali ke Menu Sebelumnya"};
    list(listMenu);
    int l = this.inputInt("Silahkan Pilih : "); 
    if (l == 1) {
      list(listTypeProduct);
      int j = this.inputInt("Silahkan Pilih : ");
      if (j == 1) {
        this.listFood();
        int g = this.inputInt("Silahkan Pilih : ");
        int m = g - 1;
        int o = this.inputInt("Masukkan Jumlah Stok : ");
        this.addFoodQty(m, o);
        out("Anda Berhasil Menambah Stok Sejumlah " + o + " Pada Produk " + this.foodData.get(m).getName() + "\n");
        String p = this.inputStr("Apakah Anda ingin Lanjut? : ");

        if(p.equals("y") || p.equals("ya") || p.equals("yes")){
        this.sellerData();

       } else {
         Menu data = new Menu();

       }

      }
      else if (j == 2) {
        this.listDrink();
        int g = this.inputInt("Silahkan Pilih : ");
        int m = g - 1;
        int o = this.inputInt("Masukkan Jumlah Stok : ");
        this.addDrinkQty(m, o);
        out("Anda Berhasil Menambah Stok Sejumlah " + o + " Pada Produk " + this.drinkData.get(m).getName() + "\n");
        String p = this.inputStr("Apakah Anda ingin Lanjut? : ");

        if(p.equals("y") || p.equals("ya") || p.equals("yes")){
        this.sellerData();

       } else {
Menu data = new Menu();
       }

      }
      
      else if (j == 3){
        String p = this.inputStr("Apakah Anda ingin Lanjut? : ");

        if(p.equals("y") || p.equals("ya") || p.equals("yes")){
        this.sellerData();

       } else {
Menu data = new Menu();
       }

      }
    }

    else if (l == 2){
      list(listTypeProduct);
      int j = this.inputInt("Silahkan Pilih : ");
      if (j == 1) {
        this.listFood();
        int g = this.inputInt("Silahkan Pilih : ");
        int m = g - 1;
        String newName = this.inputStr("Masukkan Nama Baru : ");
        int newPrice = this.inputInt("Masukkan Harga Baru : ");
        String newVariant = this.inputStr("Masukkan Varian Baru : ");
        this.editProduct("Food",m ,newName, newPrice, newVariant);
        out(this.foodData.get(m) + " " + this.foodData.get(m).getVariant() + "\n");
        String p = this.inputStr("Apakah Anda ingin Lanjut? : ");

        if(p.equals("y") || p.equals("ya") || p.equals("yes")){
        this.sellerData();

       } else {
Menu data = new Menu();
       }

      }

      else if (j == 2) {
        this.listDrink();
        int g = this.inputInt("Silahkan Pilih : ");
        int m = g - 1;
        String newName = this.inputStr("Masukkan Nama Baru : ");
        int newPrice = this.inputInt("Masukkan Harga Baru : ");
        String newSize = this.inputStr("Masukkan Ukuran Baru : ");
        this.editProduct("Drink", m, newName, newPrice, newSize);
        out(this.drinkData.get(m) + " " + this.drinkData.get(m).getSize() + "\n");
        String p = this.inputStr("Apakah Anda ingin Lanjut? : ");

        if(p.equals("y") || p.equals("ya") || p.equals("yes")){
        this.sellerData();

       } else {
Menu data = new Menu();
       }


      }

      else if (j == 3){
        String p = this.inputStr("Apakah Anda ingin Lanjut? : ");

        if(p.equals("y") || p.equals("ya") || p.equals("yes")){
        this.sellerData();

       } else {
Menu data = new Menu();
       }
      }
    }

else if (l == 3)  {

       out("\n");

       out("List Produk Dengan Kategori Makanan \n");
       this.listFoodView();

       out("\n");

       out("List Produk Dengan Kategori Minuman \n");
       this.listDrinkView();

       out("\n");

       String j = this.inputStr("Apakah Anda ingin Lanjut? : ");

       if(j.equals("y") || j.equals("ya") || j.equals("yes")){
        this.sellerData();

       } else {
Menu data = new Menu();
       }

  }

else {
  Menu data = new Menu();
}
 }
  
}
