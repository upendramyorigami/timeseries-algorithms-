package letcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DivideTwoIntegersTest {
    @Test
    public void testDivide_basic() {
        DivideTwoIntegers dti = new DivideTwoIntegers();
        assertEquals(3, dti.divide(10, 3));
        assertEquals(-2, dti.divide(7, -3));
    }
}
