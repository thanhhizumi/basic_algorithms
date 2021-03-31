import java.util.Random;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int min = 0;
        int max = 100;
        int[] unsortedArray = new int[10];
        for (int i = 0; i < 10; i++) {
            int random_int = (int)(Math.random() * (max - min + 1) + min);
            unsortedArray[i] = random_int;
        }
        System.out.println("The unsorted array is: " + Arrays.toString(unsortedArray));
        System.out.println("The sorted array is: " + "  " +Arrays.toString(selectionSort(unsortedArray)));
    }

    public static int[] selectionSort(int array[]) {  
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = minIndex + 1; j < n; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            int largerItem = array[i]; 
            array[i] = array[minIndex];
            array[minIndex] = largerItem;
        }
        return array;  
    }  
}