package letcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class SubstringWithConcatenationOfAllWordsTest {
    @Test
    public void testFindSubstring_basic() {
        SubstringWithConcatenationOfAllWords scaw = new SubstringWithConcatenationOfAllWords();
        List<Integer> result = scaw.findSubstring("barfoothefoobarman", new String[]{"foo","bar"});
        assertTrue(result.contains(0));
        assertTrue(result.contains(9));
    }
}
