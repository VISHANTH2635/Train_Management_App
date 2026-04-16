import java.util.*;

public class TrainManagement {

    public static void main(String[] args) {

        System.out.println("===========================================");
        System.out.println(" UC16 - Manual Sorting using Bubble Sort");
        System.out.println("===========================================\n");

        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("Original Capacities:");
        printArray(capacities);

        int[] sorted = bubbleSort(capacities);

        System.out.println("\nSorted Capacities (Ascending):");
        printArray(sorted);

        System.out.println("\nUC16 sorting completed...");
    }

    public static int[] bubbleSort(int[] arr) {
        int[] copy = arr.clone(); // do not modify original

        for (int i = 0; i < copy.length - 1; i++) {
            for (int j = 0; j < copy.length - 1 - i; j++) {
                if (copy[j] > copy[j + 1]) {
                    int temp = copy[j];
                    copy[j] = copy[j + 1];
                    copy[j + 1] = temp;
                }
            }
        }
        return copy;
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(" ");
        }
        System.out.println();
    }
}