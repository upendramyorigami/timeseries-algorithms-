package letcode;

public class SubsetsII {
    // LeetCode 90: Subsets II
    public java.util.List<java.util.List<Integer>> subsetsWithDup(int[] nums) {
        java.util.List<java.util.List<Integer>> res = new java.util.ArrayList<>();
        java.util.Arrays.sort(nums);
        backtrack(res, new java.util.ArrayList<>(), nums, 0);
        return res;
    }
    private void backtrack(java.util.List<java.util.List<Integer>> res, java.util.List<Integer> temp, int[] nums, int start) {
        res.add(new java.util.ArrayList<>(temp));
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) continue;
            temp.add(nums[i]);
            backtrack(res, temp, nums, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}
