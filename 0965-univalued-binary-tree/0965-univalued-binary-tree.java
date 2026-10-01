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
    static boolean flag;
    public boolean isUnivalTree(TreeNode root) {
        int check = root.val;
        flag = true;
        solve(check,root);
        return flag;
    }
    static void solve(int check,TreeNode root){
        if(root!=null){
            solve(check,root.left);
            if(check!=root.val){
                flag = false;
                return;
            }
            solve(check,root.right);
        }
    }
}