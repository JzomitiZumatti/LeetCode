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
    public int maxDepth(TreeNode root) {
        int height;
        if (root == null) {
            height = 0;
        } else {
            int lefHeight = maxDepth(root.left);
            int rightHeight = maxDepth(root.right);
            height = 1 + Math.max(lefHeight,
                    rightHeight);
        }
        return height;
    }
}