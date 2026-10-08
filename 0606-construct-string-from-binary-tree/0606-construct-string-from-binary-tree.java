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
    static StringBuilder s;
    public String tree2str(TreeNode root) {
        s = new StringBuilder();
        solve(root,s);
        return s.toString();
    }
    static void solve(TreeNode root,StringBuilder s){
        if(root==null){
            return;
        }
        s.append(root.val);
        if(root.left==null && root.right==null){
            return;
        }
        s.append("(");
        solve(root.left,s);
        s.append(")");

        if(root.right!=null){
            s.append("(");
        solve(root.right,s);
        s.append(")");
        }

    }
}