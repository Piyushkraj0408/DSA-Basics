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
        if(root==null || (root.left==null && root.right==null))return true;
        int maxi1 = height(root.left);
        int maxi2 = height(root.right);
        if(Math.abs(maxi1-maxi2)>1){
            return false;
        }

        if (!isBalanced(root.left)) {
            return false;
        }

        if (!isBalanced(root.right)) {
            return false;
        }
        return true;
    }
    static int height(TreeNode root){
        if(root==null)
        return 0;
        int left = height(root.left);
        int right = height(root.right);
        return 1+Math.max(left,right);
    }
}