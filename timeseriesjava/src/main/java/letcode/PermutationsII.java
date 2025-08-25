package letcode;

public class PermutationsII {
    // LeetCode 47: Permutations II
    public java.util.List<java.util.List<Integer>> permuteUnique(int[] nums) {
        java.util.List<java.util.List<Integer>> res = new java.util.ArrayList<>();
        java.util.Arrays.sort(nums);
        backtrack(res, new java.util.ArrayList<>(), nums, new boolean[nums.length]);
        return res;
    }
    private void backtrack(java.util.List<java.util.List<Integer>> res, java.util.List<Integer> temp, int[] nums, boolean[] used) {
        if (temp.size() == nums.length) {
            res.add(new java.util.ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])) continue;
            used[i] = true;
            temp.add(nums[i]);
            backtrack(res, temp, nums, used);
            used[i] = false;
            temp.remove(temp.size() - 1);
        }
    }
}
