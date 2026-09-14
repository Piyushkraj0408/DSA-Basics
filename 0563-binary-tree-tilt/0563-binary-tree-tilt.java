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
    public int findTilt(TreeNode root) {
        ans = 0;
        solve(root);
        return ans;
    }
    static int solve(TreeNode root){
        if(root==null)
        return 0;

        int left = solve(root.left);
        int right = solve(root.right);

        ans += Math.abs(left-right);
        return right+left+root.val;
    }
}