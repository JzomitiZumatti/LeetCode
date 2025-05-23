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
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root.left, root.right);
    }

    public static boolean isMirror(TreeNode left, TreeNode right) {
        if ((left == null && right != null) || (right == null && left != null)) {
            return false;
        } else if (left != null && right != null && left.val != right.val) {
            return false;
        } else if (left == null && right == null) {
            return true;
        } else {
            return isMirror(left.left, right.right) && isMirror(left.right, right.left);
        }
    }
}