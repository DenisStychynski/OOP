package Seminar.Seminar1;

import java.util.Calendar;

public class Beverage extends Product {
        //- Open-closed principle (Принцип открытости/закрытости)
        // Можно добавить другие характеристики напитков не меняя реализацию класса
        
        // - Single responsibility principle (Принцип единственной ответственности)
        // Конструктор объектов класса напитков
                                                    
    private double volume;

     public Beverage(int id, String name, int price, int quantity, Calendar best_before, double volume ){
        super(id, name, price, quantity, best_before);
        this.volume = volume;
    }
    
    public double getVolume() {
        return volume;
    }
    
        

    @Override
    public String toString(){
        
        return "\n"+"ID: "+getID()+"  "+getName() + "  Цена: " + getPrice() + "  Кол-во: " + getQuantity() + "  Объем: " + volume 
                              + "  Годен до: " +getBest_before().get(Calendar.DAY_OF_MONTH) +"."+ getBest_before().get(Calendar.MONTH)
                              +"." + getBest_before().get(Calendar.YEAR) ;
    }


}