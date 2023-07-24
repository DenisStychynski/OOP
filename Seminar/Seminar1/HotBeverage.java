package Seminar.Seminar1;
public class HotBeverage extends Beverage {
    private int temperature;

    public HotBeverage (String name, double price, double volume, int temperature){
    super(name,price,volume);
    this.temperature = temperature;


}
public int getTemperature() {
    return temperature;
}
@Override
public String toString() {
    return "HotBeverage [ name=" + name + ", price=" + price + ", volume=" + volume + "temperature=" + temperature + "]";
}


}