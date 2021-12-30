package src.database.java;

import src.child.products.food.java.Food;
import src.child.products.drink.java.Drink;
import src.helper.java.Helper;

public class Database extends Helper {

  public Food[] getFoodData(){

    Food foodData[] = {
        new Food("Nasi Goreng Pecel", 20000, "Original"),
        new Food("Soto Ayam", 25000, "Original"),
        new Food("Tongseng Kambing", 35000, "Original"),
        new Food("Steak Wagyu Sherloin Grade A5", 1305000, "Original")
    };

    return foodData;

  }

  public Drink[] getDrinkData(){

    Drink drinkData[] = {
        new Drink("Jus Jeruk", 8000, "Medium"),
        new Drink("Strawberry Squash", 15000, "Medium"),
        new Drink("Ice Goyobod", 25000, "Medium"),
        new Drink("Es Campur Sari", 130000, "Medium")
      };

    return drinkData;

  }

  public void setFoodName(int val, String newName){
    this.getFoodData()[val].setName(newName);
  }

  public void setDrinkName(int val, String newName){
    this.getDrinkData()[val].setName(newName);
  }
  
}
