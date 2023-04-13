package org.example.filler;

import org.example.enums.Ingreadient;

import java.util.HashMap;

public class IngredientsHolder {
   public static HashMap<Ingreadient, Double>holder = new HashMap<>();
   static{
       holder.put(Ingreadient.water,1000.00);
       holder.put(Ingreadient.milk,1000.00);
       holder.put(Ingreadient.beans,1000.00);
   }

   public static void addIngreadients(Ingreadient type, double quantity ){
       holder.put(type, holder.get(type)+quantity);
   }

    public static double getIngreadients(Ingreadient type){
       return holder.get(type);
    }
}
