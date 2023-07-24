package Seminar.Seminar1;

public class Beverage {

    protected String name;
    protected double price;
    protected double volume;

    public Beverage(String name, double price, double volume) {
        this.name = name;
        this.price = price;
        this.volume = volume;

    }
    public String getName(){
        return name;
    }
    public double getPrice() {
        return price;
    }
    public double getVolume() {
        return volume;
    }
    @Override
    public String toString() {
        return "Beverage [name=" + name + ", price=" + price + ", volume=" + volume + "]";
    }
  
}
