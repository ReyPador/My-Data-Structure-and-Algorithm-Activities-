import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Ask input from user
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        
        //Declaration of an array
        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        //Sorting Algorithm Choice
        System.out.println("Choose a sorting algorithm:");
        System.out.println("1. Insertion Sort\n2. Selection Sort\n3. Merge Sort\n4. Quick Sort");
        int choice = sc.nextInt();

        int[] sortedArray = Arrays.copyOf(array, array.length); // Preserve the original array for custom sorting
        switch (choice) {
            
            case 1: insertionSort(sortedArray); break;
            case 2 : selectionSort(sortedArray); break;
            case 3 : mergeSort(sortedArray, 0, sortedArray.length - 1); break;
            case 4 : quickSort(sortedArray, 0, sortedArray.length - 1); break;
            default : System.out.println("Invalid choice");
        }
        
        // print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(sortedArray));
    }

      //Operation for Insertion
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

        //Operation for Selection 
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
    
  
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    //Operation for Merge
    public static void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        System.arraycopy(array, left, leftArray, 0, n1);
        System.arraycopy(array, mid + 1, rightArray, 0, n2);

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
    
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

        // Output the sorted arrayimport java.util.Arrays;    
import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Step 1: Enter size of an array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] array = new int[size];
        
        // Step 2: Enter elements of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        // Step 3: Output all the elements in ORDER
        System.out.println("Array elements in order: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
        
        // Step 4: Output the SMALLEST integer in the array
        int smallest = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        System.out.println("Smallest element in the array: " + smallest);
        
        // Step 5: Output the EVEN elements of the array
        System.out.println("Even elements in the array: ");
        for (int element : array) {
            if (element % 2 == 0) {
                System.out.print(element + " ");
            }
        }
        System.out.println();
        
        // Step 6: Output all the elements of the array in DESCENDING ORDER
        Arrays.sort(array);
        System.out.println("Array elements in descending order: ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}

        System.out.println("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        
        sc.close();
    }
}
    //Operation for QuickSort
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }
                         }
