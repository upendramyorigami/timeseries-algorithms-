package letcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeNumberTest {
    @Test
    public void testIsPalindrome_basic() {
        PalindromeNumber pn = new PalindromeNumber();
        assertTrue(pn.isPalindrome(121));
        assertFalse(pn.isPalindrome(-121));
        assertFalse(pn.isPalindrome(10));
    }
}
