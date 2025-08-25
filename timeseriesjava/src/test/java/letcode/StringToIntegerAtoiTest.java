package letcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringToIntegerAtoiTest {
    @Test
    public void testAtoi_basic() {
        StringToIntegerAtoi stia = new StringToIntegerAtoi();
        assertEquals(42, stia.myAtoi("42"));
        assertEquals(-42, stia.myAtoi("   -42"));
        assertEquals(4193, stia.myAtoi("4193 with words"));
        assertEquals(0, stia.myAtoi("words and 987"));
        assertEquals(-2147483648, stia.myAtoi("-91283472332")); // underflow
    }
}
