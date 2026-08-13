import java.util.ArrayList;
import java.util.Comparator;

public class myarray {
   public static void main(String []args){


        // int[] arr = {10,20,30,40};
        
        // int temp=arr[0];
        // arr[0]=arr[arr.length-1];
        // arr[arr.length-1]=temp;
        
        // System.err.println(arr[0]);
        // System.err.println(arr[arr.length-1]);
        // System.out.println(arr.length);
        // System.out.println(arr[1+2]);
        ArrayList<Integer> array = new ArrayList<>(); 
        array.add (23);
        array.add(12);
        array.add(25);
        array.add(89);
        array.add(12);
        System.out.println(array.lastIndexOf(12));
        System.err.println(array.isEmpty());
        // System.out.println(array.sort());
        System.err.println(array);
        


    }

}


    

