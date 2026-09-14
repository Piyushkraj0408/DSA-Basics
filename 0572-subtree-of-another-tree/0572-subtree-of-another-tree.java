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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null || subRoot==null) return false;
        if(solve(root,subRoot)) return true;
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }
    static boolean solve(TreeNode a, TreeNode b){
       if(a==null && b==null) return true;
        if(a==null || b==null) return false;
        if(a.val!=b.val) return false;
        return solve(a.left,b.left) && solve(a.right,b.right);
    }
}