package org.obs.TwoDarraylist;

import java.util.ArrayList;

public class TwoDiaArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> groceryList = new ArrayList();
        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("butter cake");
        bakeryList.add("garlic bred");
        bakeryList.add("donuts");
        ArrayList<String> vegList = new ArrayList();
        vegList.add("tomatoes");
        vegList.add("onion");
        vegList.add("cabbage");
        vegList.add("carrot");
        ArrayList<String> drinkList = new ArrayList();
        drinkList.add("soda");
        drinkList.add("pepsi");
        drinkList.add("7up");
        drinkList.add("coffee");

        groceryList.add(bakeryList);
        groceryList.add(vegList);
        groceryList.add(drinkList);
        System.out.println(groceryList);
        for (int i = 0; i < groceryList.size(); i++) {
            ArrayList<String> variable = groceryList.get(i);
            for (int j = 0; j < variable.size(); j++) {
                System.out.println(variable.get(j));
            }
            System.out.println();
        }
        int size1 = groceryList.size();
        System.out.println("the size od the 2D arraylist is:" + size1);
        String change = groceryList.get(2).set(2, "TEA");
        System.out.println("after replacing 7 up with coffee,the arraylist is :" + groceryList);
        groceryList.get(0).remove("pasta");
        System.out.println(groceryList);
        if (groceryList.get(0).contains("chicken")) {
            System.out.println("chicken is here");
        } else
            groceryList.get(0).add("chicken");
        System.out.println("chicken added :" + groceryList);
        int index1 = groceryList.get(1).indexOf("carrot");
        System.out.println("the index of carrot is :" + index1);
        groceryList.get(1).remove("onion");
        System.out.println(groceryList);



    }
}
