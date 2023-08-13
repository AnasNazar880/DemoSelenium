package org.obs.TwoDarraylist;

import java.util.ArrayList;

public class TwoDiaArray1 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Object>> fruitsList=new ArrayList();
        ArrayList<Object>numbers=new ArrayList();
        ArrayList<Object>indFruits=new ArrayList();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        indFruits.add("Mango");
        indFruits.add("papaya");
        indFruits.add("water mellon");
        indFruits.add("orange");
        fruitsList.add(numbers);
        fruitsList.add(indFruits);
        System.out.println(fruitsList);
        for(int i=0;i<fruitsList.size();i++) {
            ArrayList<Object> variable = fruitsList.get(i);
            for (int j = 0; j < variable.size();j++){
                System.out.println(variable.get(j));
            }
            System.out.println();
        }
        int size2=fruitsList.size();
        int size1=fruitsList.get(0).size();
        System.out.println(size2);



    }
}
