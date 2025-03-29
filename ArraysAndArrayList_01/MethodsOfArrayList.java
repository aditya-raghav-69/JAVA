package ArraysAndArrayList_01;

import java.util.ArrayList;
import java.util.Arrays;
// import java.util.Collections;,
import java.util.Scanner;

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

        // Here is the use of indexOf() method to get the index of an element in the ArrayList
        // The indexOf() method returns the index of the first occurrence of the element in the ArrayList
        // and -1 if the element is not present in the ArrayList

        int index = listFruits.indexOf("Mango");
        System.out.println("Index of 'Mango' in the ArrayList: " + index);

        int[] arr = {1, 2, 3, 4, 5};
        // Here is the use of Arrays.toString() method to convert an array to a string
        // The Arrays.toString() method returns a string representation of the array

        System.out.println("Array: " + Arrays.toString(arr));
        // Here is the use of Arrays.sort() method to sort an array

        String[] arr1 = { "Banana", "Apple", "Mango", "Orange", "Grapes" };
        System.out.println("Original array: " + Arrays.toString(arr1));
        
        Arrays.sort(arr1);
        // The Arrays.sort() method sorts the array in ascending order
        // and the sorted array is printed using the Arrays.toString() method
        System.out.println("Sorted array: " + Arrays.toString(arr1));



        // Here we shall enter the elements of the ArrayList using Scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the ArrayList: ");

        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Enter the number of elements which you want to add in the ArrayList: ");
        // If we left an element empty in arraylist then it will be added as null
        int n = sc.nextInt();
        System.out.println("Enter the elements of the ArrayList: ");
        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            list.add(element);
        }
        System.out.println("ArrayList: " + list);





        
        sc.close();

        

    }
    
}
