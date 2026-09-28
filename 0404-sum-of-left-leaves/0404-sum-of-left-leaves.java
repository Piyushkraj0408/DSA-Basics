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
    public int sumOfLeftLeaves(TreeNode root) {
        return solve(root,false);
    }
    static int solve(TreeNode root,boolean flag){
        if(root==null){
            return 0;
        }
        if((root.left==null && root.right==null)){
            return flag?root.val:0;
        }
        int ls = solve(root.left,true);
        int rs = solve(root.right,false);
        return ls+rs;
    }
}