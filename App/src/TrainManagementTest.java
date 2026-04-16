import org.junit.Test;
import static org.junit.Assert.*;

public class TrainManagementTest {

    @Test
    public void testException_ValidCapacityCreation() throws Exception {
        PassengerBogie b = new PassengerBogie("Sleeper", 72);
        assertNotNull(b);
    }

    @Test(expected = InvalidCapacityException.class)
    public void testException_NegativeCapacityThrowsException() throws Exception {
        new PassengerBogie("Sleeper", -10);
    }

    @Test(expected = InvalidCapacityException.class)
    public void testException_ZeroCapacityThrowsException() throws Exception {
        new PassengerBogie("Sleeper", 0);
    }

    @Test
    public void testException_ExceptionMessageValidation() {
        try {
            new PassengerBogie("Sleeper", 0);
        } catch (InvalidCapacityException e) {
            assertEquals("Capacity must be greater than zero", e.getMessage());
        }
    }

    @Test
    public void testException_ObjectIntegrityAfterCreation() throws Exception {
        PassengerBogie b = new PassengerBogie("AC Chair", 56);
        assertEquals("AC Chair", b.type);
        assertEquals(56, b.capacity);
    }

    @Test
    public void testException_MultipleValidBogiesCreation() throws Exception {
        PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
        PassengerBogie b2 = new PassengerBogie("AC Chair", 56);

        assertNotNull(b1);
        assertNotNull(b2);
    }
}