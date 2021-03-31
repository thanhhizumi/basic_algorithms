import java.util.Random;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int min = 0;
        int max = 100;
        int[] unsortedArray = new int[10];
        for (int i = 0; i < 10; i++) {
            int random_int = (int)(Math.random() * (max - min + 1) + min);
            unsortedArray[i] = random_int;
        }
        System.out.println("The unsorted array is: " + Arrays.toString(unsortedArray));
        System.out.println("The sorted array is: " + "  " +Arrays.toString(bubbleSort(unsortedArray)));
    }

    public static int[] bubbleSort(int array[]) {  
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (array[j] > array[j+1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;  
    }  
}