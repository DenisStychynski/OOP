package Seminar.Seminar1;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class HotBeverageAutomat extends Automat {  
    // - Single responsibility principle (Принцип единственной ответственности)
    // Добавление горячих напитков в автомат
     public Product findProduct(ArrayList<Product> list_products, String name,  double volume, int temperature){
        for (Product el : list_products) {
            if (el instanceof HotBeverage ){
                if ((((HotBeverage) el).getName().equals(name))&&
                    (((HotBeverage) el).getVolume() == (volume))&&
                    (((HotBeverage) el).getTemperature() == temperature)){
                      return el;  
                }
            }
        }
        return null;
    }
    public ArrayList <Product> getHotBeverrage(){
        ArrayList <Product> my_list = new ArrayList<>();
        my_list.add(new HotBeverage(21,"Nesсafe", 150, 35, 
                    new GregorianCalendar(2024, 5, 12), 0.33, 25));
        my_list.add(new HotBeverage(22,"Jacobs", 120, 3, 
                    new GregorianCalendar(2024, 6, 07), 0.33, 20));
        my_list.add(new HotBeverage(24,"Bushido", 170, 12, 
                    new GregorianCalendar(2024, 03, 11), 0.6, 25));
        return my_list;

    }
}