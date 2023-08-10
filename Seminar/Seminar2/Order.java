package Seminar.Seminar2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import java.util.Iterator;

import Seminar.Seminar1.Beverage;
import Seminar.Seminar1.Product;

public class Order {
 ArrayList<Product> list;
     Human man;



public Order createOrder(Product[]products, Human man){
List availableProduct = new ArrayList();
double totalCost = 0;

for (Product product: products ){
    if(product.getPrice()>0){
        availableProduct.add(products);
totalCost +=product.getMoney();
    }
}
Order order = new Order();
order.get(man);
return order;
}



private void get(Human man2) {
}



@Override
public String toString(){
StringBuilder sb =new StringBuilder();
sb.append("Заказчик: ").append(man.getName()).append("n");
sb.append("Состав заказа: n");




sb.append("Общая стоимость: ").append("n");
return sb . toString();}


public void validateOrder(){
    
    Iterator<Map.Entry<Product,Integer>> iterator = items.entrySet().iterator();
    while (iterator.hasNext()) {
        Map.Entry<Product,Integer> entry = iterator.next();
        Product product = entry.getKey();
        int quantityOrdered = entry.getValue();
        int quantityInStock = product.getQuantity();
        if (quantityOrdered > quantityInStock) {
            iterator.remove();
            
        }
    }
}



public void addItem(Product product2, int i) {
}



public void checkour() {
}

public void addProduct(T product){
    product.add(product);
}
Order mixedOrder = new Order();
mixedOrder.addProduct(new Food("Хлеб"));
mixedOrder.addProduct(new Beverage("Вода"));
}