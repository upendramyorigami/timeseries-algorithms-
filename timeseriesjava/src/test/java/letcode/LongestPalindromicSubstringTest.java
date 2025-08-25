package letcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LongestPalindromicSubstringTest {
    @Test
    public void testLongestPalindrome_basic() {
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
        assertEquals("bab", lps.longestPalindrome("babad"));
        assertEquals("bb", lps.longestPalindrome("cbbd"));
    }
}
