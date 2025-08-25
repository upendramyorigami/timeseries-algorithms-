package letcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MedianOfTwoSortedArraysTest {
    @Test
    public void testMedian_basic() {
        MedianOfTwoSortedArrays mtsa = new MedianOfTwoSortedArrays();
        assertEquals(2.0, mtsa.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}), 0.0001);
        assertEquals(2.5, mtsa.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}), 0.0001);
    }
}
