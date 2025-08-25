import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class SlidingWindowMaximumTest {

    // Example implementation for testing
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || k <= 0) return new int[0];
        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {
            while (!deque.isEmpty() && deque.peekFirst() <= i - k)
                deque.pollFirst();
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i])
                deque.pollLast();
            deque.offerLast(i);
            if (i >= k - 1)
                result[i - k + 1] = nums[deque.peekFirst()];
        }
        return result;
    }

    @Test
    void testBasicCase() {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] expected = {3,3,5,5,6,7};
        assertArrayEquals(expected, maxSlidingWindow(nums, k));
    }

    @Test
    void testSingleElementWindow() {
        int[] nums = {4,2,12,3};
        int k = 1;
        int[] expected = {4,2,12,3};
        assertArrayEquals(expected, maxSlidingWindow(nums, k));
    }

    @Test
    void testWindowEqualsArrayLength() {
        int[] nums = {2,1,3};
        int k = 3;
        int[] expected = {3};
        assertArrayEquals(expected, maxSlidingWindow(nums, k));
    }

    @Test
    void testEmptyArray() {
        int[] nums = {};
        int k = 3;
        int[] expected = {};
        assertArrayEquals(expected, maxSlidingWindow(nums, k));
    }

    @Test
    void testKGreaterThanArrayLength() {
        int[] nums = {1,2};
        int k = 5;
        int[] expected = {};
        assertArrayEquals(expected, maxSlidingWindow(nums, k));
    }
}