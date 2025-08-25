package letcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContainerWithMostWaterTest {
    @Test
    public void testMaxArea_basic() {
        ContainerWithMostWater cwmw = new ContainerWithMostWater();
        assertEquals(49, cwmw.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
        assertEquals(1, cwmw.maxArea(new int[]{1,1}));
    }
}
