package letcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LongestCommonPrefixTest {
    @Test
    public void testLongestCommonPrefix_basic() {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        assertEquals("fl", lcp.longestCommonPrefix(new String[]{"flower","flow","flight"}));
        assertEquals("", lcp.longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }
}
