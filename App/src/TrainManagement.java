import java.util.*;

public class TrainManagement {

    public static void main(String[] args) {

        System.out.println("===========================================");
        System.out.println(" UC20 - Prevent Search on Empty Train");
        System.out.println("===========================================\n");

        List<String> bogieIds = new ArrayList<>(); // empty list
        String searchKey = "BG101";

        try {
            boolean found = searchBogie(bogieIds, searchKey);

            System.out.println("Searching for: " + searchKey);
            System.out.println("Bogie Found: " + found);

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nUC20 validation completed...");
    }

    public static boolean searchBogie(List<String> bogies, String key) {

        if (bogies.isEmpty()) {
            throw new IllegalStateException("No bogies available in train for search");
        }

        for (String id : bogies) {
            if (id.equals(key)) {
                return true;
            }
        }
        return false;
    }
}