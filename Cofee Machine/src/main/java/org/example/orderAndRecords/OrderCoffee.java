package org.example.orderAndRecords;

import org.example.cofees.Cappuccino;
import org.example.cofees.Espresso;
import org.example.cofees.Latte;
import org.example.enums.CoffeeTypes;

import java.util.HashMap;
import java.util.Map;

public class OrderCoffee {
    public static void placeOrder(Integer id){
        switch(id){
            case 1: Espresso.makeCofee();
            break;
            case 2:
                Cappuccino.makeCofee();
            break;
            case 3:
                Latte.makeCofee();
            break;
        }
    }

    static HashMap<CoffeeTypes,Double>map = new HashMap<>();
    static {
        map.put(CoffeeTypes.cappuccino,6.0);
        map.put(CoffeeTypes.espresso,4.0);
        map.put(CoffeeTypes.latte,7.0);
    }
    public static void print(){
        int i = 1;
        for(Map.Entry<CoffeeTypes,Double>ele:map.entrySet()){
            System.out.println("Press "+i+" for "+ele.getKey()+" "+ele.getValue());
            i++;
        }
    }
}
