package letcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RemoveElementTest {
    @Test
    public void testRemoveElement_basic() {
        RemoveElement re = new RemoveElement();
        int[] nums = {3,2,2,3};
        int len = re.removeElement(nums, 3);
        assertEquals(2, len);
        assertEquals(2, nums[0]);
        assertEquals(2, nums[1]);
    }
}
