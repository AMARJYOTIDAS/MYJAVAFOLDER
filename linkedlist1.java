import java.util.LinkedList;
import java .util.Scanner;


public class linkedlist1{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Accessing elements
        System.out.println(list.get(1)); // Banana

        // Removing element
        list.remove("Banana");

        list.addFirst("mango");
        list.addLast("papaya");
        list.add(2,"cherry");
        
        //System.out.println(list.get(3));
        System.out.println(list);
    //     System.out.println(list.size());
    //    System.out.println( list.reversed());
    }
}
