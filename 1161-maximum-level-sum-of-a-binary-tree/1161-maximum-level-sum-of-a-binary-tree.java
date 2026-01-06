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
    public int maxLevelSum(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int max = 0;
        int j = 1;
        int maxSum = Integer.MIN_VALUE;;
        while (!queue.isEmpty()) {
            int level = queue.size();
            int i = 0;
            int levelSum = 0;
            while (i < level) {
                TreeNode current = queue.poll();
                levelSum += current.val;
                if (current.left != null) {
                    queue.add(current.left);
                }

                if (current.right != null) {
                    queue.add(current.right);
                }
                i++;
            }
            if (levelSum > maxSum) {
                maxSum = levelSum;
                max = j;
            }
            j++;
        }
        return max;
    }
}