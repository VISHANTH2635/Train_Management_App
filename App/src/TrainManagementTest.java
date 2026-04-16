import org.junit.Test;
import static org.junit.Assert.*;

public class TrainManagementTest {

    @Test
    public void testSearch_BogieFound() {
        String[] arr = {"BG101","BG205","BG309","BG412","BG550"};

        assertTrue(TrainManagement.linearSearch(arr, "BG309"));
    }

    @Test
    public void testSearch_BogieNotFound() {
        String[] arr = {"BG101","BG205","BG309","BG412","BG550"};

        assertFalse(TrainManagement.linearSearch(arr, "BG999"));
    }

    @Test
    public void testSearch_FirstElementMatch() {
        String[] arr = {"BG101","BG205","BG309"};

        assertTrue(TrainManagement.linearSearch(arr, "BG101"));
    }

    @Test
    public void testSearch_LastElementMatch() {
        String[] arr = {"BG101","BG205","BG309","BG412","BG550"};

        assertTrue(TrainManagement.linearSearch(arr, "BG550"));
    }

    @Test
    public void testSearch_SingleElementArray() {
        String[] arr = {"BG101"};

        assertTrue(TrainManagement.linearSearch(arr, "BG101"));
    }
}