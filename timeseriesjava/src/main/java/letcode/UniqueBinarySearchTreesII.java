package letcode;

public class UniqueBinarySearchTreesII {
    // LeetCode 95: Unique Binary Search Trees II
    public static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int x) { val = x; }
    }
    public java.util.List<TreeNode> generateTrees(int n) {
        if (n == 0) return new java.util.ArrayList<>();
        return generate(1, n);
    }
    private java.util.List<TreeNode> generate(int start, int end) {
        java.util.List<TreeNode> res = new java.util.ArrayList<>();
        if (start > end) {
            res.add(null);
            return res;
        }
        for (int i = start; i <= end; i++) {
            for (TreeNode left : generate(start, i - 1)) {
                for (TreeNode right : generate(i + 1, end)) {
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    res.add(root);
                }
            }
        }
        return res;
    }
}
