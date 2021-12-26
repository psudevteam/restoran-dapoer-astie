package src.customer.java;

public class Customer{
    public String nama;
    public double uang;
    String[] keranjang; 

    public Customer(String nama, double uang,String[]keranjang){
        this.nama = nama;
        this.uang = uang;
        this.keranjang = keranjang;

    }
    public void setNama(String newNama){
        this.nama = newNama;
    }
    public String getNama(){
        return this.nama;
    }

}