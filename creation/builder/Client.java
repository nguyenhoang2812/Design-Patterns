import type.BreadType;
import type.OrderType;
import type.SauceType;
import type.VegetableType;

public class Client {
     public static void main(String[] args) {
        Order order1 = new FastFoodOrderBuilder()
                                              .orderType(OrderType.ON_SITE)
                                              .orderBread(BreadType.OMELETTE)
                                              .orderSauce(SauceType.SOY_SAUCE)
                                              .orderVegetable(VegetableType.TOMATO)
                                                      .build();
        System.out.println(order1);


        Order order2 = new FastFoodOrderBuilder()
                .orderBread(BreadType.BEEF)
                .orderSauce(SauceType.SOY_SAUCE)
                .build();

         System.out.println(order2);


        Order order3 = new Order(OrderType.ON_SITE, BreadType.BEEF, SauceType.KETCHUP, VegetableType.TOMATO);
        System.out.println(order3);
    }
}
