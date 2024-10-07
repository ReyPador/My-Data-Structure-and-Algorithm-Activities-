import java.util.Scanner;

public class BubbleSort {
    
    // Bubble Sort method
    public static void bubbleSort(int[] array) {
        int n = array.length;
        // Loop over the array
        for (int i = 0; i < n - 1; i++) {
            // Flag to detect if any swaps were made during the pass
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the current element is greater than the next element
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true; // A swap was made
                }
            }
            // If no elements were swapped in the inner loop, the array is already sorted
            if (!swapped) {
                break;
            }
        }
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

        // Perform Bubble Sort
        bubbleSort(array);

        // Output the sorted array
        System.out.println("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        
        sc.close();
    }
}
