import org.junit.Test;
import static org.junit.Assert.*;

public class TrainManagementTest {

    @Test
    public void testSort_BasicAlphabeticalSorting() {
        String[] input = {"Sleeper","AC Chair","First Class","General","Luxury"};
        String[] expected = {"AC Chair","First Class","General","Luxury","Sleeper"};

        assertArrayEquals(expected, TrainManagement.sortBogieNames(input));
    }

    @Test
    public void testSort_UnsortedInput() {
        String[] input = {"Luxury","General","Sleeper","AC Chair"};
        String[] expected = {"AC Chair","General","Luxury","Sleeper"};

        assertArrayEquals(expected, TrainManagement.sortBogieNames(input));
    }

    @Test
    public void testSort_AlreadySortedArray() {
        String[] input = {"AC Chair","First Class","General"};

        assertArrayEquals(input, TrainManagement.sortBogieNames(input));
    }

    @Test
    public void testSort_DuplicateBogieNames() {
        String[] input = {"Sleeper","AC Chair","Sleeper","General"};
        String[] expected = {"AC Chair","General","Sleeper","Sleeper"};

        assertArrayEquals(expected, TrainManagement.sortBogieNames(input));
    }

    @Test
    public void testSort_SingleElementArray() {
        String[] input = {"Sleeper"};

        assertArrayEquals(input, TrainManagement.sortBogieNames(input));
    }
}