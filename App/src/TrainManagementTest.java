import org.junit.Test;
import static org.junit.Assert.*;

public class TrainManagementTest {

    @Test
    public void testSort_BasicSorting() {
        int[] input = {72, 56, 24, 70, 60};
        int[] expected = {24, 56, 60, 70, 72};

        assertArrayEquals(expected, TrainManagement.bubbleSort(input));
    }

    @Test
    public void testSort_AlreadySortedArray() {
        int[] input = {24, 56, 60, 70, 72};

        assertArrayEquals(input, TrainManagement.bubbleSort(input));
    }

    @Test
    public void testSort_DuplicateValues() {
        int[] input = {72, 56, 56, 24};
        int[] expected = {24, 56, 56, 72};

        assertArrayEquals(expected, TrainManagement.bubbleSort(input));
    }

    @Test
    public void testSort_SingleElementArray() {
        int[] input = {50};

        assertArrayEquals(input, TrainManagement.bubbleSort(input));
    }

    @Test
    public void testSort_AllEqualValues() {
        int[] input = {40, 40, 40};

        assertArrayEquals(input, TrainManagement.bubbleSort(input));
    }
}