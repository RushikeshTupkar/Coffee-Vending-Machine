package org.example.orderAndRecords;

import org.example.enums.Ingreadient;

import java.util.HashMap;
import java.util.Map;

public class Record {
    public static double total=0.0;
    public static HashMap<Ingreadient, Double> ingreadientUsed = new HashMap<>();
    static{
        ingreadientUsed.put(Ingreadient.water,0.00);
        ingreadientUsed.put(Ingreadient.milk,0.00);
        ingreadientUsed.put(Ingreadient.beans,0.00);
    }

    public static void ingreadientsUsed(Ingreadient type, double quantity ){
        ingreadientUsed.put(type, ingreadientUsed.get(type)+quantity);
    }
    public static void addTotal(double price){
        total+=price;
    }

    public static void printRecord(){
        for(Map.Entry<Ingreadient,Double>ele:ingreadientUsed.entrySet()){
            System.out.println("Ingreadient spent -> "+ele.getKey()+" -> "+ele.getValue());
        }
        System.out.println("----------------------------------------------------------------");
        System.out.println("Total ammount of cofees sold -> "+total);
    }
}
