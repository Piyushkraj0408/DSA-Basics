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
    private static int curr =0;
    private static int min = Integer.MAX_VALUE;
    private static boolean has;
    public int minDiffInBST(TreeNode root) {
        curr =0;
        min = Integer.MAX_VALUE;
        has = false;
        solve(root);
        return min;
    }
    static void solve(TreeNode root){
        if(root==null)
        return;

        solve(root.left);

        if(has){
            int value = (int)Math.abs(root.val-curr);
            min = Math.min(min,value);
        }

        curr=root.val;
        has = true;
        solve(root.right);
    }
}