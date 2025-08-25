package letcode;

public class FindFirstAndLastPositionOfElementInSortedArray {
    // LeetCode 34: Find First and Last Position of Element in Sorted Array
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        res[0] = findBound(nums, target, true);
        res[1] = findBound(nums, target, false);
        return res;
    }
    private int findBound(int[] nums, int target, boolean isFirst) {
        int left = 0, right = nums.length - 1, bound = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                bound = mid;
                if (isFirst) right = mid - 1;
                else left = mid + 1;
            } else if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return bound;
    }
}
