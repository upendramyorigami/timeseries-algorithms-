package letcode;

public class BinaryTreeInorderTraversal {
    // LeetCode 94: Binary Tree Inorder Traversal
    public static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int x) { val = x; }
    }
    public java.util.List<Integer> inorderTraversal(TreeNode root) {
        java.util.List<Integer> res = new java.util.ArrayList<>();
        inorder(root, res);
        return res;
    }
    private void inorder(TreeNode node, java.util.List<Integer> res) {
        if (node == null) return;
        inorder(node.left, res);
        res.add(node.val);
        inorder(node.right, res);
    }
}
