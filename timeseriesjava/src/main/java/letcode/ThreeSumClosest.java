package letcode;

public class ThreeSumClosest {
    // LeetCode 16: 3Sum Closest
    public int threeSumClosest(int[] nums, int target) {
        java.util.Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(sum - target) < Math.abs(closest - target)) {
                    closest = sum;
                }
                if (sum < target) left++;
                else right--;
            }
        }
        return closest;
    }
}
