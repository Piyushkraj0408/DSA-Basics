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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null && targetSum!=0) return false;
         return solve(root,targetSum ,0);
    }
    static boolean solve(TreeNode root, int targetSum,int curr){
        if(root==null) return false;
        curr+=root.val;
        if (root.left == null && root.right == null) {
            return curr == targetSum;
        }
        return solve(root.left,targetSum,curr) || solve(root.right,targetSum,curr);
    }
}