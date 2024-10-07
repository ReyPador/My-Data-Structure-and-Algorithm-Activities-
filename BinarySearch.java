import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    // Binary search method (with internal sorting)
    public static int binarySearch(int[] array, int target, int low, int high) {
        if (low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] > target) {
                return binarySearch(array, target, low, mid - 1);
            } else {
                return binarySearch(array, target, mid + 1, high);
            }
        }
        return -1; // Return -1 if the element is not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of elements
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        // Input the elements of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        // Input the target value to search
        System.out.print("Enter the value to search using Binary Search: ");
        int target = sc.nextInt();

        // Sort the array for binary search
        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray); // Sort the array internally for binary search
        // Perform binary search
        int binaryResult = binarySearch(sortedArray, target, 0, sortedArray.length - 1);
        System.out.print ("Sorted array: " + sortedArray);

        // Output the result of binary search
        System.out.println("Binary Search result: " + (binaryResult != -1 ? "Found at index " + binaryResult : "Not found"));

        sc.close();
    }
    }
