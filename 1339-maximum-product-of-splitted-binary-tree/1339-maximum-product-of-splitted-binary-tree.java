/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxProduct(TreeNode root) {
        long genSum = totalSum(root);
        AtomicLong maxSum = new AtomicLong(0);
        dfs(root, maxSum, genSum);
        return (int)(maxSum.get() % 1_000_000_007);
    }

    public static long dfs(TreeNode root, AtomicLong maxSum, long genSum) {
        if (root == null) return 0;

        long left = dfs(root.left, maxSum, genSum);
        long right = dfs(root.right, maxSum, genSum);

        long subtreeSum = left + right + root.val;
        long product = subtreeSum * (genSum - subtreeSum);

        maxSum.set(Math.max(maxSum.get(), product));

        return subtreeSum;
    }

    public static long totalSum(TreeNode root) {
        if (root == null) return 0;
        return totalSum(root.left) + root.val + totalSum(root.right);
    }
}