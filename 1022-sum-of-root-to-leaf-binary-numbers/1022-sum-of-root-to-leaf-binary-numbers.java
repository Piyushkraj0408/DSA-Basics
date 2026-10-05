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
    public int sumRootToLeaf(TreeNode root) {
        ans = 0;
        solve(root,0);
        return ans;
        
    }
    static void solve(TreeNode root,int num){
        if(root==null){
            return;
        }

        num = num*2+root.val;
        if(root.left==null && root.right==null){
            ans+=num;
            return;
        }

        solve(root.left,num);
        solve(root.right,num);
    }
}