package letcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ThreeSumTest {
    @Test
    public void testThreeSum_basic() {
        ThreeSum ts = new ThreeSum();
        java.util.List<java.util.List<Integer>> result = ts.threeSum(new int[]{-1,0,1,2,-1,-4});
        assertTrue(result.contains(java.util.Arrays.asList(-1, -1, 2)));
        assertTrue(result.contains(java.util.Arrays.asList(-1, 0, 1)));
    }
}
