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
    static int sum;
    public int deepestLeavesSum(TreeNode root) {
        int h = height(root);
        sum = 0;
        solve(root,h-1,0);
        return sum;
    }
    static int height(TreeNode root){
        if(root==null)return 0;
        int rl = height(root.left);
        int rh=height(root.right);
        return 1+Math.max(rl,rh);
    }
    static void solve(TreeNode root,int h,int c){
        if(root==null)return;
        if(c==h){
            sum+=root.val;
        }
        solve(root.left,h,c+1);
        solve(root.right,h,c+1);
    }
}