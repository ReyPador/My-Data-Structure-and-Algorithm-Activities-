import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String [] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt ();
       
       int [] array = new int [n];
       System.out.println("Enter the elements of the array: ");
       for (int i =0; i < n; i++) {
          array [i] = sc.nextInt ();      
       }
       
     System.out.print("Enter the value to search using Linear Search: ");
        int target = sc.nextInt();
        int LinearResult = LinearSearch(array, target);
        System.out.println("Linear Search result: " + (/LinearResult != -1 ? "Found at index " + LinearResult : "Not found"));
        
        public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
