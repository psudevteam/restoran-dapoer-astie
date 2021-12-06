public class Makanan extends Product {

    public Makanan(String name){
      super(name, 290000, "Makanan ");      
    }

    public static void main(String[] args){
      Makanan data = new Makanan("Seblak Ceker");
      data.setPriceProduct(290000);

      String name = data.getName();
      String category = data.getCategory();
      int harga = data.getPrice();

      System.out.println(category + name + " Harganya adalah " + "Rp." + harga);

    }
}
