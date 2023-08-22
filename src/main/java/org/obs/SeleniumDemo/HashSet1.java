package org.obs.SeleniumDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
public class HashSet1 {
    public static void main(String[] args) {
       /* Set<String> fruits=new HashSet<>();//creating a hashset
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("banana");
        fruits.add("grapes");
        fruits.add("watermelon");
        fruits.add("Apple");//duplicates will not be allowed
        //System.out.println(fruits);
       // int size=fruits.size();
       // System.out.println("the size of the set  is :" +size);
        //fruits.remove("Orange");
       // System.out.println(fruits);
        boolean ladyf=fruits.contains("ladyfinger");
        System.out.println("ladyfinger is present or not:"+ladyf);
       Iterator<String>itr=fruits.iterator();
       while (itr.hasNext()){
       String element= itr.next();
           System.out.println(element);
       }*/

       Set<String>linkedHashset=new LinkedHashSet<>();
       linkedHashset.add("one");
       linkedHashset.add("two");
       linkedHashset.add("three");
       linkedHashset.add("four");
       linkedHashset.add("five");
       linkedHashset.remove("five");
        System.out.println(linkedHashset);
        int size1=linkedHashset.size();
        System.out.println(size1);
        linkedHashset.add("six");

       Iterator<String>itr=linkedHashset.iterator();
       while (itr.hasNext()){
           String element= itr.next();
           System.out.println(element);
       }

    }

}
