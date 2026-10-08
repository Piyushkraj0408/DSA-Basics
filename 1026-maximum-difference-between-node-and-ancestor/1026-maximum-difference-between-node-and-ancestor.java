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
    static int maxdiff;
    public int maxAncestorDiff(TreeNode root) {
        maxdiff=-1;
        int min=root.val;
        int max=root.val;
        solve(min,max,root);
        return maxdiff;
    }
    static void solve(int min,int max,TreeNode root){
        if(root==null)return;
        int diff =Math.max(Math.abs(root.val-min),Math.abs(root.val-max));
        if(diff>maxdiff){
            maxdiff = diff;
        }
        if(min>root.val){
            min = root.val;
        }
        if(max<root.val){
            max = root.val;
        }
        solve(min,max,root.left);
        solve(min,max,root.right);
    }
}