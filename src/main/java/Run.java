package src.main.java;

import src.product.java.Product;
import java.util.Scanner;

class Run extends Product {

    public Run(String name){
        super(name, "Makanan", 290000);    
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        System.out.println("Masukan Nama Product : ");
        String newName = sc.nextLine();
        Run data = new Run(newName);
        String name = data.getName();
        data.setName(newName);
        int harga = data.getPrice();
        System.out.println(name + " " + "Rp." + harga);
    }
}
