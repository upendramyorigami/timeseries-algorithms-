package letcode;

public class CombinationSumII {
    // LeetCode 40: Combination Sum II
    public java.util.List<java.util.List<Integer>> combinationSum2(int[] candidates, int target) {
        java.util.List<java.util.List<Integer>> res = new java.util.ArrayList<>();
        java.util.Arrays.sort(candidates);
        backtrack(res, new java.util.ArrayList<>(), candidates, target, 0);
        return res;
    }
    private void backtrack(java.util.List<java.util.List<Integer>> res, java.util.List<Integer> temp, int[] candidates, int target, int start) {
        if (target == 0) {
            res.add(new java.util.ArrayList<>(temp));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) continue;
            if (candidates[i] > target) break;
            temp.add(candidates[i]);
            backtrack(res, temp, candidates, target - candidates[i], i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}
