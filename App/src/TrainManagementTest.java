import org.junit.Test;
import static org.junit.Assert.*;

public class TrainManagementTest {

    @Test
    public void testCargo_SafeAssignment() {
        GoodsBogie b = new GoodsBogie("Cylindrical");
        b.assignCargo("Petroleum");

        assertEquals("Petroleum", b.cargo);
    }

    @Test
    public void testCargo_UnsafeAssignmentHandled() {
        GoodsBogie b = new GoodsBogie("Rectangular");

        try {
            b.assignCargo("Petroleum");
            assertNull(b.cargo); // cargo should not be assigned
        } catch (Exception e) {
            fail("Exception should be handled inside method");
        }
    }

    @Test
    public void testCargo_CargoNotAssignedAfterFailure() {
        GoodsBogie b = new GoodsBogie("Rectangular");
        b.assignCargo("Petroleum");

        assertNull(b.cargo);
    }

    @Test
    public void testCargo_ProgramContinuesAfterException() {
        GoodsBogie b1 = new GoodsBogie("Rectangular");
        GoodsBogie b2 = new GoodsBogie("Cylindrical");

        b1.assignCargo("Petroleum"); // unsafe
        b2.assignCargo("Petroleum"); // safe

        assertEquals("Petroleum", b2.cargo);
    }

    @Test
    public void testCargo_FinallyBlockExecution() {
        GoodsBogie b = new GoodsBogie("Cylindrical");
        b.assignCargo("Petroleum");

        assertNotNull(b.cargo);
    }
}