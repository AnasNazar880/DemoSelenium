package org.obs.SeleniumDemo;
import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("mango");
        fruits.add("Orange");
        fruits.add("Pinapple");
        fruits.add("grapes");

        int size1=fruits.size();
        System.out.println("the size of the array is :"+size1);
        for(String i:fruits)
            System.out.println(i);


        List<Integer>numbers=new ArrayList<>();
        numbers.add(3);
        numbers.add(6);
        numbers.add(9);
        numbers.add(7);
        numbers.add(8);
        int size2=numbers.size();
        int numValue=numbers.get(1);
        System.out.println("the first index value :"+numValue);

        System.out.println("the size of the list is :"+size2);
        for(int i:numbers)
            System.out.println(i);



    }
}
