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
    static int ans;
    public int sumEvenGrandparent(TreeNode root) {
        ans = 0;
        solve(root,null,null);
        return ans;
    }
    static void solve(TreeNode root,TreeNode prev,TreeNode supaprev){
        if(root==null)return;
        if(supaprev!=null && supaprev.val%2==0){
            ans+=root.val;
        }
        solve(root.left,root,prev);
        solve(root.right,root,prev);
    }
}