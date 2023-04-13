package org.example.cofees;

import org.example.filler.IngredientsHolder;
import org.example.orderAndRecords.Record;
import org.example.enums.Ingreadient;

import java.util.HashMap;
import java.util.Map;

public class Latte {
    public static double price = 7.0;
    public static HashMap<Ingreadient,Double> ingreadients = new HashMap<>();
    static{
        ingreadients.put(Ingreadient.water,350.0);
        ingreadients.put(Ingreadient.milk,75.0);
        ingreadients.put(Ingreadient.beans,20.0);
    }


    public static void makeCofee(){
        for(Map.Entry<Ingreadient,Double>ele:ingreadients.entrySet()){
            if(IngredientsHolder.getIngreadients(ele.getKey())<ingreadients.get(ele.getKey())){
                System.out.println("Not enough ingredients  available for making Latte");
                return;
            }
        }
        for(Map.Entry<Ingreadient,Double>ele:ingreadients.entrySet()){
            IngredientsHolder.holder.put(ele.getKey(), IngredientsHolder.getIngreadients(ele.getKey())-ingreadients.get(ele.getKey()));
            Record.ingreadientUsed.put(ele.getKey(), IngredientsHolder.getIngreadients(ele.getKey())+ingreadients.get(ele.getKey()));
        }
        Record.addTotal(price);
        System.out.println("Here is your Latte | price = "+price);
    }
}
