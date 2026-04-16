import java.util.*;

public class TrainManagement {

    public static void main(String[] args) {

        System.out.println("===========================================");
        System.out.println(" UC17 - Sort Bogie Names using Arrays.sort()");
        System.out.println("===========================================\n");

        String[] bogies = {"Sleeper","AC Chair","First Class","General","Luxury"};

        System.out.println("Original Bogie Names:");
        System.out.println(Arrays.toString(bogies));

        sortBogieNames(bogies);

        System.out.println("\nSorted Bogie Names (Alphabetical):");
        System.out.println(Arrays.toString(bogies));

        System.out.println("\nUC17 sorting completed...");
    }

    // Method used by test cases
    public static String[] sortBogieNames(String[] arr) {
        String[] copy = arr.clone(); // avoid modifying original
        Arrays.sort(copy);
        return copy;
    }
}