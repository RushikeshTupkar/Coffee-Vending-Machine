package org.example.cofees;

import org.example.filler.IngredientsHolder;
import org.example.orderAndRecords.Record;
import org.example.enums.Ingreadient;

import java.util.HashMap;
import java.util.Map;

public class Cappuccino {
    public static double price = 6.0;
    public static HashMap<Ingreadient,Double> ingreadients = new HashMap<>();
    static{
        ingreadients.put(Ingreadient.water,200.0);
        ingreadients.put(Ingreadient.milk,100.0);
        ingreadients.put(Ingreadient.beans,12.0);
    }


    public static void makeCofee(){
        for(Map.Entry<Ingreadient,Double>ele:ingreadients.entrySet()){
            if(IngredientsHolder.getIngreadients(ele.getKey())<ingreadients.get(ele.getKey())){
                System.out.println("Not enough ingredients  available for making Cappuccino");
                return;
            }
        }
        for(Map.Entry<Ingreadient,Double>ele:ingreadients.entrySet()){
            IngredientsHolder.holder.put(ele.getKey(), IngredientsHolder.getIngreadients(ele.getKey())-ingreadients.get(ele.getKey()));
            Record.ingreadientUsed.put(ele.getKey(), IngredientsHolder.getIngreadients(ele.getKey())+ingreadients.get(ele.getKey()));
        }
        Record.addTotal(price);
        System.out.println("Here is your Cappuccino | price = "+price);
    }
}
