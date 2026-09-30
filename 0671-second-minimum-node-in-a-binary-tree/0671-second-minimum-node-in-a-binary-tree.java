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
    static int secmin = Integer.MAX_VALUE;
    static boolean flag;
    public int findSecondMinimumValue(TreeNode root) {
        int min = root.val;
        secmin=Integer.MAX_VALUE;
        flag = false;
        solve(min,root);

        return flag?secmin:-1;
    }
    static void solve(int min,TreeNode root){
        if(root==null) return;
        if(root.val>min){
            flag = true;
            secmin = Math.min(secmin,root.val);
        }
        solve(min,root.left);
        solve(min,root.right);
    }
}