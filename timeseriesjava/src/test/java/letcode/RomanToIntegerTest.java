package letcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RomanToIntegerTest {
    @Test
    public void testRomanToInt_basic() {
        RomanToInteger rti = new RomanToInteger();
        assertEquals(3, rti.romanToInt("III"));
        assertEquals(4, rti.romanToInt("IV"));
        assertEquals(9, rti.romanToInt("IX"));
        assertEquals(58, rti.romanToInt("LVIII"));
        assertEquals(1994, rti.romanToInt("MCMXCIV"));
    }
}
