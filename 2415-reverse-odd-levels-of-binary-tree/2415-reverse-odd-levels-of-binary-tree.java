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
    public TreeNode reverseOddLevels(TreeNode root) {
        reverse(root.left,root.right,true);
        return root;
    }
    static void reverse(TreeNode l,TreeNode r,boolean flag){
        if(l==null || r==null)return;
        if(flag){
            int temp=l.val;
            l.val=r.val;
            r.val=temp;
        }
        reverse(l.left,r.right,!flag);
        reverse(l.right,r.left,!flag);
    }

}