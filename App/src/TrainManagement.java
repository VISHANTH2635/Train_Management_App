import java.util.*;

public class TrainManagement {

    public static void main(String[] args) {

        System.out.println("===========================================");
        System.out.println(" UC19 - Binary Search for Bogie ID");
        System.out.println("===========================================\n");

        String[] bogieIds = {"BG101","BG205","BG309","BG412","BG550"}; // sorted
        String searchKey = "BG309";

        System.out.println("Sorted Bogie IDs:");
        System.out.println(Arrays.toString(bogieIds));

        boolean found = binarySearch(bogieIds, searchKey);

        System.out.println("\nSearching for: " + searchKey);
        System.out.println("Bogie Found: " + found);

        System.out.println("\nUC19 search completed...");
    }

    // Method for test cases
    public static boolean binarySearch(String[] arr, String key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int cmp = key.compareTo(arr[mid]);

            if (cmp == 0) {
                return true;
            } else if (cmp > 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}