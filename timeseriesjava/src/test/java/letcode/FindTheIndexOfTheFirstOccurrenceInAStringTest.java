package letcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FindTheIndexOfTheFirstOccurrenceInAStringTest {
    @Test
    public void testStrStr_basic() {
        FindTheIndexOfTheFirstOccurrenceInAString ftio = new FindTheIndexOfTheFirstOccurrenceInAString();
        assertEquals(2, ftio.strStr("hello", "ll"));
        assertEquals(-1, ftio.strStr("aaaaa", "bba"));
    }
}
