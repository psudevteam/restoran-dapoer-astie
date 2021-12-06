public abstract class Product {

	private String name;
	private int price;
  private String category;

	public Product(String nameProduct, int priceProduct, String categoryProduct){
		this.setNameProduct(nameProduct);
		this.setPriceProduct(priceProduct);
		this.setCategoryProduct(categoryProduct);
	}

	public void setNameProduct(String newName){
		this.name = newName;
	}

  public void setPriceProduct(int newPrice){
		this.price = newPrice;
	}

  public void setCategoryProduct(String newCategory){
		this.category = newCategory;
  }

	public String getName(){
    return this.name;
	}

  public String getCategory(){
    return this.category;
	}

	public int getPrice(){
		return this.price;
	}

}
