package letcode;

public class Permutations {
    // LeetCode 46: Permutations
    public java.util.List<java.util.List<Integer>> permute(int[] nums) {
        java.util.List<java.util.List<Integer>> res = new java.util.ArrayList<>();
        backtrack(res, new java.util.ArrayList<>(), nums, new boolean[nums.length]);
        return res;
    }
    private void backtrack(java.util.List<java.util.List<Integer>> res, java.util.List<Integer> temp, int[] nums, boolean[] used) {
        if (temp.size() == nums.length) {
            res.add(new java.util.ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            used[i] = true;
            temp.add(nums[i]);
            backtrack(res, temp, nums, used);
            used[i] = false;
            temp.remove(temp.size() - 1);
        }
    }
}
