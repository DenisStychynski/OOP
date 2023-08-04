package Seminar.Seminar1;


import java.util.GregorianCalendar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import Seminar.Seminar2.Order;

public class Program {
    


/**
 * @param args
 */
public static void main(String[] args) {
    Beverage tea = new HotBeverage("Tea", 1.5, 200, 85);
    Beverage coffee = new HotBeverage("Coffee", 2.0, 250, 90);
    Beverage cocoa = new HotBeverage("Cocoa", 2.5, 300, 80);
    Beverage[] beverages ={tea,coffee,cocoa};
    HotBeverageAutomat hotBeverageAutomat = new HotBeverageAutomat(beverages);
    HotBeverage teaFromAutomat = hotBeverageAutomat.getProduct("Tea", 200, 85);
    if (teaFromAutomat != null){
        System.out.println("Here's your tea: " + teaFromAutomat);
    }else{
        System.out.println("Sorry, we don't have your tea.");
    }
    HotBeverage coffeeFromAutomat = hotBeverageAutomat.getProduct("Coffee", 250, 90);
    if (coffeeFromAutomat != null){
        System.out.println("Here's your coffee: " + coffeeFromAutomat);
    }else{
        System.out.println("Sorry, we don't have your coffee.");
    }
HotBeverage cocoaFromAutomat = hotBeverageAutomat.getProduct("Cocoa", 300, 80);
    if (cocoaFromAutomat != null){
        System.out.println("Here's your cocoa: " + cocoaFromAutomat);
    }else{
        System.out.println("Sorry, we don't have your cocoa.");
    }

    

    Product product1 = new Food("Twix", 80.1,0.7, 10,new GregorianCalendar(2023, 10, 10) ); 
     Product product2 = new Food("Mars", 90.5,0.8, 50,new GregorianCalendar(2023, 10, 10) ) ;
      Product product3 = new Food("Snicers", 60.7,0.6, 15,new GregorianCalendar(2023, 10, 10) ) ;
      Product[]  products ={product1,product2,product3};
 
      Automat list = new Automat();
      List<Product> myList = new ArrayList<>();
      myList.add(product1);
    myList.add(product2);
      myList.add(product3);
      list.initProduct(myList);

      String name = "Twix";
       System.out.println(list.getProduct(name).toString());


Scanner scanner = new Scanner(System.in);
System.out.println("Выберете критерий сортировки(1- по весу, 2 - по обьему, 3 - по температуре):");
int choice = scanner.nextInt();
if (choice == 1){
    Arrays.sort(products,Comparator.comparing(Food :: getWeight));
    System.out.println("Товары отсортированы по весу:");
}else if (choice == 2){
    Arrays.sort(beverages,Comparator.comparing(Beverage :: getVolume));
    System.out.println("Товары отсортированы по обьему:");
}else{
    Arrays.sort(beverages,Comparator.comparing(HotBeverage :: getTemperature));
    System.out.println("Товары отсортированы по температуре:");

for (Product product : products){
    System.out.println(product);
}


Order order = new Order();
order.addItem(product1, 2);
order.addItem(product2, 4);
order.addItem(product3, 15);
order.validateOrder();
order.checkour();
    }
}
}