package letcode;

public class PermutationSequence {
    // LeetCode 60: Permutation Sequence
    public String getPermutation(int n, int k) {
        java.util.List<Integer> nums = new java.util.ArrayList<>();
        for (int i = 1; i <= n; i++) nums.add(i);
        int[] fact = new int[n];
        fact[0] = 1;
        for (int i = 1; i < n; i++) fact[i] = fact[i - 1] * i;
        k--;
        StringBuilder sb = new StringBuilder();
        for (int i = n; i >= 1; i--) {
            int idx = k / fact[i - 1];
            sb.append(nums.get(idx));
            nums.remove(idx);
            k %= fact[i - 1];
        }
        return sb.toString();
    }
}
