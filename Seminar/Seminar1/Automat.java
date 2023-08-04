package Seminar.Seminar1;

import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.MediaSize.Other;


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
public Other createOrder(ArrayList<Product> shoppingList){
return null;
}



public void initProduct(Beverage tea, Beverage coffee, Beverage cocoa, Product product1, Product product2,
    Product product3) {
}}
