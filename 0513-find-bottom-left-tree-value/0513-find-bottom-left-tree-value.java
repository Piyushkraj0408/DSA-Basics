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
    static int maxidepth =-1;
    static int maxival = 0;
    public int findBottomLeftValue(TreeNode root) {
        maxidepth =-1;
        maxival=0;
        solve(root,0);
        return maxival;
    }
    static void solve(TreeNode root,int depth){
        if(root==null)return;
        if(maxidepth<depth){
            maxidepth = depth;
            maxival=root.val;
        }
        solve(root.left,depth+1);
        solve(root.right,depth+1);
    }
}