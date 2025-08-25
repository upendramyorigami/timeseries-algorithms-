package letcode;

public class RemoveDuplicatesFromSortedArrayII {
    // LeetCode 80: Remove Duplicates from Sorted Array II
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums) {
            if (i < 2 || n > nums[i - 2]) nums[i++] = n;
        }
        return i;
    }
}
