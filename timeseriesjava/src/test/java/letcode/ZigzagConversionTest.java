package letcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ZigzagConversionTest {
    @Test
    public void testConvert_basic() {
        ZigzagConversion zc = new ZigzagConversion();
        assertEquals("PAHNAPLSIIGYIR", zc.convert("PAYPALISHIRING", 3));
        assertEquals("PINALSIGYAHRPI", zc.convert("PAYPALISHIRING", 4));
    }
}
