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
    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }

    public static int height(TreeNode root) {
        int heigh;
        if (root == null) {
            heigh = 0;
        } else {
            int lefHeight = height(root.left);
            int rightHeight = height(root.right);
            if (lefHeight == -1 || rightHeight == -1) {
                return -1;
            }
            if (Math.abs(lefHeight - rightHeight) > 1) {
                return -1;
            }
            heigh = 1 + Math.max(lefHeight,
                    rightHeight);
        }

        return heigh;
    }
}