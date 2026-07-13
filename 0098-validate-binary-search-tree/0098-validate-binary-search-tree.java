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
    public boolean isvalid(TreeNode root,Long minval,Long maxval){
        if(root==null){
            return true;
        }
        if(root.val>=maxval || root.val<=minval){
            return false;
            }
        return isvalid(root.left,minval,(long)root.val) && isvalid(root.right,(long)root.val,maxval); 
    }
    public boolean isValidBST(TreeNode root) {
        return isvalid(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
}