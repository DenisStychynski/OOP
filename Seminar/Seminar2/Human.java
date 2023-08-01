package Seminar.Seminar2;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import Seminar.Seminar1.Automat;
import Seminar.Seminar1.Beverage;
import Seminar.Seminar1.Food;
import Seminar.Seminar1.HotBeverage;
import Seminar.Seminar1.Product;

public class Human extends Actor {
    private double money;
    private Automat nearestAutomat; 
    public Human(String name1, boolean make_order1,boolean take_order1, double money){
        super(name1, make_order1, take_order1);
        this.money = money;
    }
public double getMoney() {
    return money;
}
public void setMoney(double money){
    this.money = money;
}
    @Override
    public void setTake_order(boolean b) {
       
        
    }

    @Override
    public void setMake_order(boolean d) {
      
       
    }

    @Override
    public boolean getTook_order() {
        return false;
        
       
    }

    @Override
    public boolean getMade_order() {
        return false;
       
      
    }
    public void findNearestAutomat(Automat nearestAutomat){
         Beverage tea = new HotBeverage("Tea", 1.5, 200, 85);
    Beverage coffee = new HotBeverage("Coffee", 2.0, 250, 90);
    Beverage cocoa = new HotBeverage("Cocoa", 2.5, 300, 80);Product product1 = new Food("Twix", 80.1,0.7, 10,new GregorianCalendar(2023, 10, 10) ); 
     Product product2 = new Food("Mars", 90.5,0.8, 50,new GregorianCalendar(2023, 10, 10) ) ;
      Product product3 = new Food("Snicers", 60.7,0.6, 15,new GregorianCalendar(2023, 10, 10) ) ;
        Automat automat = new Automat();
        automat.initProduct(tea,coffee,cocoa,product1,product2,product3);
       this.nearestAutomat = automat;
    }  
   
    public Order makeOrder(List<String> deList) {
        ArrayList<Product> shoppingList = new ArrayList<>();
        Product shoppingProduct;
       for (String nameProduct : deList){
        shoppingProduct = nearestAutomat.getProduct(nameProduct);
        if (nearestAutomat.getProduct(nameProduct)!=null) {
            shoppingList.add(shoppingProduct);
        }
       }
       setMake_order(true);
       return nearestAutomat.createOrder(shoppingList);
    }
}
