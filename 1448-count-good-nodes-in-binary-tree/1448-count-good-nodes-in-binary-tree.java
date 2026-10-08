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
    static int c;
    public int goodNodes(TreeNode root) {
        c=0;
        int max = root.val;
        solve(root,max);
        return c;
    }
    static void solve(TreeNode root,int max){
        if(root==null)return;
        if(root.val>=max){
            max = root.val;
            c++;
        }
        solve(root.left,max);
        solve(root.right,max);
    }
}