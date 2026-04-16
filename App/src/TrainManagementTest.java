import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class TrainManagementTest {

    @Test(expected = IllegalStateException.class)
    public void testSearch_EmptyTrainThrowsException() {
        List<String> bogies = new ArrayList<>();

        TrainManagement.searchBogie(bogies, "BG101");
    }

    @Test
    public void testSearch_NonEmptyTrainWorks() {
        List<String> bogies = Arrays.asList("BG101","BG205","BG309");

        assertTrue(TrainManagement.searchBogie(bogies, "BG205"));
    }

    @Test
    public void testSearch_BogieNotFound() {
        List<String> bogies = Arrays.asList("BG101","BG205","BG309");

        assertFalse(TrainManagement.searchBogie(bogies, "BG999"));
    }
}