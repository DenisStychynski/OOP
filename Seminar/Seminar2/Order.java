package Seminar.Seminar2;

import java.util.ArrayList;
import java.util.List;

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

@Override
public String toString(){
StringBuilder sb =new StringBuilder();
sb.append("Заказчик: ").append(man.getName()).append("n");
sb.append("Состав заказа: n");
}



sb.append("Общая стоимость: ").append("n");
return sb.toString();
}



