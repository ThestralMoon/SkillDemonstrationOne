import static org.junit.Assert.*;
import org.junit.*;

public class DemoTest {

    // Fail Initially
    @Test
    public void testMultiply() {
        assertEquals(3.5, Demo.multiply(2.5, 1));
    }
}
