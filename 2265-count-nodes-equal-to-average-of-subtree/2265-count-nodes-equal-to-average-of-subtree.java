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

    int cnt = 0;

    public int[] preorder(TreeNode node) {
        if (node == null) {
            return new int[]{0, 0};
        }

        int[] left = preorder(node.left);
        int[] right = preorder(node.right);

        int sum = node.val + left[0] + right[0];
        int count = 1 + left[1] + right[1];

        return new int[]{sum, count};
    }

    public void preorder_(TreeNode node) {
        if (node == null) return;

        int[] result = preorder(node);

        int sum = result[0];
        int count = result[1];

        if (sum / count == node.val) {
            cnt++;
        }

        preorder_(node.left);
        preorder_(node.right);
    }

    public int averageOfSubtree(TreeNode root) {
        preorder_(root);
        return cnt;
    }
}