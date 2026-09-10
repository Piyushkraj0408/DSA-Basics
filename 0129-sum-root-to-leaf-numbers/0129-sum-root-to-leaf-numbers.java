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
    public int sumNumbers(TreeNode root) {
        if(root==null)
        return 0;
        return sums(0,root,0);
    }
    static int sums(int sum,TreeNode root,int num){
        if (root == null) {
            return 0;
        }
        if(root.left==null && root.right==null){
            num = root.val + num * 10;
            return num;
        }
        sum += sums(sum,root.left,num*10+root.val)+sums(sum,root.right,num*10+root.val);
        return sum;
    }
}