package ArraysAndArrayList_01;

import java.util.ArrayList;
import java.util.Arrays;
// import java.util.Collections;

public class MethodsOfArrayList {

    public static void main(String[] args) {

        ArrayList<String> listFruits = new ArrayList<String>();
        // Here are some frequently used methods of ArrayList:
        // Here is the use of add() method to add elements to the ArrayList
        listFruits.add("Apple");
        listFruits.add("Banana");
        listFruits.add("Mango");
        listFruits.add("Orange");
        listFruits.add("Grapes");
        listFruits.add("Pineapple");
        listFruits.add("Watermelon");
        listFruits.add("Papaya");
        listFruits.add("Kiwi");
        listFruits.add("Strawberry");
        listFruits.add("Blueberry");
        listFruits.add("Raspberry");
        listFruits.add("Blackberry");
        listFruits.add("Peach");
        listFruits.add("Plum");
        listFruits.add("Cherry");
        listFruits.add("Apricot");
        listFruits.add("Coconut");
        listFruits.add("Lemon");
        listFruits.add("Lime");
        listFruits.add("Tangerine");
        listFruits.add("Pomegranate");
        listFruits.add("Avocado");
        listFruits.add("Fig");
        listFruits.add("Date");

        // Here is the use of get() method to get elements from the ArrayList
        
        for (int i = 0; i < listFruits.size(); i++) {
            System.out.println("Element at index " + i + ": " + listFruits.get(i));
        }
        // Here is the use of size() method to get size   of the ArrayList
        System.out.println("Size of the ArrayList: " + listFruits.size());

        // Here is the use of remove() method to remove elements from the ArrayList
        listFruits.remove("Apple");
        listFruits.remove("Banana");
        listFruits.remove("Mango");

        System.out.println("ArrayList after removing elements: " + listFruits);
        // Here is the use of contains() method to check if an element is present in the ArrayList
        System.out.println("Does the ArrayList contain 'Apple'? " + listFruits.contains("Apple"));
        System.out.println("Does the ArrayList contain 'Banana'? " + listFruits.contains("Banana"));

        // the contain method returns true if the element is present in the ArrayList

        // and false if the element is not present in the ArrayList

        

        


    }
    
}
