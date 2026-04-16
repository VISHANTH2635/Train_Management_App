import java.util.*;

public class TrainManagement {

    public static void main(String[] args) {

        System.out.println("===========================================");
        System.out.println(" UC18 - Linear Search for Bogie ID");
        System.out.println("===========================================\n");

        String[] bogieIds = {"BG101","BG205","BG309","BG412","BG550"};
        String searchKey = "BG309";

        System.out.println("Bogie IDs:");
        System.out.println(Arrays.toString(bogieIds));

        boolean found = linearSearch(bogieIds, searchKey);

        System.out.println("\nSearching for: " + searchKey);
        System.out.println("Bogie Found: " + found);

        System.out.println("\nUC18 search completed...");
    }

    public static boolean linearSearch(String[] arr, String key) {
        for (String id : arr) {
            if (id.equals(key)) {
                return true;
            }
        }
        return false;
    }
}