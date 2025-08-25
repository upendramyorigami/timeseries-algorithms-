package letcode;

public class CombinationSum {
    // LeetCode 39: Combination Sum
    public java.util.List<java.util.List<Integer>> combinationSum(int[] candidates, int target) {
        java.util.List<java.util.List<Integer>> res = new java.util.ArrayList<>();
        backtrack(res, new java.util.ArrayList<>(), candidates, target, 0);
        return res;
    }
    private void backtrack(java.util.List<java.util.List<Integer>> res, java.util.List<Integer> temp, int[] candidates, int target, int start) {
        if (target == 0) {
            res.add(new java.util.ArrayList<>(temp));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > target) continue;
            temp.add(candidates[i]);
            backtrack(res, temp, candidates, target - candidates[i], i);
            temp.remove(temp.size() - 1);
        }
    }
}
