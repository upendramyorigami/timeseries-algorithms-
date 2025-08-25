package letcode;

public class Combinations {
    // LeetCode 77: Combinations
    public java.util.List<java.util.List<Integer>> combine(int n, int k) {
        java.util.List<java.util.List<Integer>> res = new java.util.ArrayList<>();
        backtrack(res, new java.util.ArrayList<>(), 1, n, k);
        return res;
    }
    private void backtrack(java.util.List<java.util.List<Integer>> res, java.util.List<Integer> temp, int start, int n, int k) {
        if (temp.size() == k) {
            res.add(new java.util.ArrayList<>(temp));
            return;
        }
        for (int i = start; i <= n; i++) {
            temp.add(i);
            backtrack(res, temp, i + 1, n, k);
            temp.remove(temp.size() - 1);
        }
    }
}
