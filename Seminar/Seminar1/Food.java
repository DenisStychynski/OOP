package Seminar.Seminar1;

import java.util.Calendar;

public class Food extends Product  {
  
    protected double weight;
    
  
    public Food (String name, double price, double weight,int quantity, Calendar bestBefore){
        super(name, price, quantity, bestBefore);
        this.weight = weight;
        
    }
   
    
    public double getWeight() {
        return weight;
    }
}
  
    
  

