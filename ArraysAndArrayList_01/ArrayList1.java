
package ArraysAndArrayList_01;
import java.util.ArrayList;


public class ArrayList1 {
    public static void main(String[] args) {
        // Your code goes here

        // an integer arraylist
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);


        System.out.println("\n \n here we have the elements of the first arraylist with the size:  "+list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // a string arraylist

        ArrayList<String> list2 = new ArrayList<>();

        list2.add("Tu eres maria");
        list2.add("Tu eres juan");
        list2.add("Tu eres pedro");
        list2.add("el come manzanas");
        list2.add("el come peras");
        list2.add("maria bebe agua");
        list2.add("juan bebe leche");

        System.out.println("  \n \n here we have the elements of the second arraylist with the size:  "+list2.size());
            // it is the enhanced version of for loop 
        for (String element : list2) {
                    System.out.println(element);
                }


        //mixed arraylist

        ArrayList<Object> list3 = new ArrayList<>();

        list3.add("wakarimasta");
        list3.add(234);
        list3.add("arigatto gozaiumus");
        list3.add(true);

        System.out.println(" \n \n here we have the elements of the thrid arraylist with the size:  "+list3.size());

        for (Object element : list3) {
                    System.out.println(element);
                }




    }
}
