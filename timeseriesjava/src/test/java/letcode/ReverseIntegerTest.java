package letcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReverseIntegerTest {
    @Test
    public void testReverse_basic() {
        ReverseInteger ri = new ReverseInteger();
        assertEquals(321, ri.reverse(123));
        assertEquals(-321, ri.reverse(-123));
        assertEquals(21, ri.reverse(120));
        assertEquals(0, ri.reverse(1534236469)); // overflow
    }
}
