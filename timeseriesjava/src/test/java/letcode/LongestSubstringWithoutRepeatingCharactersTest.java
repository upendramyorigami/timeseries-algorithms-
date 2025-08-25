package letcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LongestSubstringWithoutRepeatingCharactersTest {
    @Test
    public void testLongestSubstring_basic() {
        LongestSubstringWithoutRepeatingCharacters lswrc = new LongestSubstringWithoutRepeatingCharacters();
        assertEquals(3, lswrc.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, lswrc.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, lswrc.lengthOfLongestSubstring("pwwkew"));
    }
}
