package letcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ThreeSumClosestTest {
    @Test
    public void testThreeSumClosest_basic() {
        ThreeSumClosest tsc = new ThreeSumClosest();
        assertEquals(2, tsc.threeSumClosest(new int[]{-1,2,1,-4}, 1));
    }
}
