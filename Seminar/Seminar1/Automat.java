package Seminar.Seminar1;

import java.util.ArrayList;
import java.util.List;

public class Automat {
    List<Product> listProduct = new ArrayList<>() ;
   
    public Automat(Beverage[] beverages) {
    }


    public Automat() {
    }


    public void initProduct(List <Product> myList){
listProduct = myList;
    }


public Product getProduct(String name) {
for(Product el : listProduct) {
    
if (el.getName() == name) {
  return el;    

    
}
    
}return null;
}

}
