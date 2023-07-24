package Seminar.Seminar1;
public class HotBeverageAutomat extends Automat {
    private Beverage[] beverages;


    public HotBeverageAutomat(Beverage[] beverages){
        super(beverages);
    }
    
   
    public HotBeverage getProduct(String name,  double volume, int temperature){
        
       
        for(Beverage beverage : beverages){
            if (beverage instanceof HotBeverage){
                HotBeverage hotBeverage =(HotBeverage) beverage;  
                if(hotBeverage.getName().equals(name)&& hotBeverage.getVolume()== volume && hotBeverage.getTemperature() == temperature){
                    return hotBeverage;
                }
            }
        }
        return null;
    }
}
