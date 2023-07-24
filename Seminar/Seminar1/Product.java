package Seminar.Seminar1;


import java.util.Calendar;

public abstract class Product{
 private   String name;
  private  double price;
  private  int quantity;
  private  Calendar bestBefore;


    public  Product( String name, double price, int quantity, Calendar bestBefore ) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.bestBefore = bestBefore;
    }
public String getName() {
    return name;
}
public Calendar getBestBefore() {
    return bestBefore;
}
public double getPrice() {
    return price;
}
public int getQuantity() {
    return quantity;
}


public void setName(String name) {
    this.name = name;
}
public void setBestBefore(Calendar bestBefore) {
    this.bestBefore = bestBefore;
}
public void setPrice(int price) {
    this.price = price;
}
public void setQuantity(int quantity) {
    this.quantity = quantity;
}
@Override
public String toString() {
    return "Product [name=" + name + ", price=" + price + ", quantity=" + quantity + ", bestBefore=" +"/"+ bestBefore.get(Calendar.YEAR) + "]";
}





}

