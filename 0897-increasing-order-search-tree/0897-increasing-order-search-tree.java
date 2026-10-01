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
    static TreeNode piyush;
    static TreeNode prev;
    public TreeNode increasingBST(TreeNode root) {
        piyush = null;
        prev = null;
        solve(root);
        return piyush;
    }
    static void solve(TreeNode root){
        if(root!=null){
            solve(root.left);
            if(piyush==null){
                piyush=root;
            }else{
                prev.right=root;
                root.left = null;
            }
            prev = root;
            
            solve(root.right);
        }
    }
}