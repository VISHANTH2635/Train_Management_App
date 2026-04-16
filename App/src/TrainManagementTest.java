import org.junit.Test;
import java.util.*;
import java.util.stream.Collectors;
import static org.junit.Assert.*;

public class TrainManagementTest {

    private List<Bogie> getBogies() {
        List<Bogie> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add(new Bogie("Sleeper", i % 100));
        }
        return list;
    }

    @Test
    public void testLoopFilteringLogic() {
        List<Bogie> bogies = getBogies();
        List<Bogie> result = new ArrayList<>();

        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                result.add(b);
            }
        }

        assertTrue(result.stream().allMatch(b -> b.capacity > 60));
    }

    @Test
    public void testStreamFilteringLogic() {
        List<Bogie> bogies = getBogies();

        List<Bogie> result = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        assertTrue(result.stream().allMatch(b -> b.capacity > 60));
    }

    @Test
    public void testLoopAndStreamResultsMatch() {
        List<Bogie> bogies = getBogies();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                loopResult.add(b);
            }
        }

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        assertEquals(loopResult.size(), streamResult.size());
    }

    @Test
    public void testExecutionTimeMeasurement() {
        long start = System.nanoTime();
        long end = System.nanoTime();

        long elapsed = end - start;

        assertTrue(elapsed >= 0);
    }

    @Test
    public void testLargeDatasetProcessing() {
        List<Bogie> bogies = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            bogies.add(new Bogie("Sleeper", i % 100));
        }

        List<Bogie> result = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        assertNotNull(result);
    }
}