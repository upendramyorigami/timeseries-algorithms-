package letcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RegularExpressionMatchingTest {
    @Test
    public void testIsMatch_basic() {
        RegularExpressionMatching rem = new RegularExpressionMatching();
        assertTrue(rem.isMatch("aa", "a*"));
        assertFalse(rem.isMatch("mississippi", "mis*is*p*."));
        assertTrue(rem.isMatch("ab", ".*"));
    }
}
