package letcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RemoveDuplicatesFromSortedArrayTest {
    @Test
    public void testRemoveDuplicates_basic() {
        RemoveDuplicatesFromSortedArray rd = new RemoveDuplicatesFromSortedArray();
        int[] nums = {1,1,2};
        int len = rd.removeDuplicates(nums);
        assertEquals(2, len);
        assertEquals(1, nums[0]);
        assertEquals(2, nums[1]);
    }
}
