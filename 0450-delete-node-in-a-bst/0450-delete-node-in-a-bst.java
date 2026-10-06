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
    public TreeNode deleteNode(TreeNode root, int key) {
        return solve(root,key);
    }
    static TreeNode solve(TreeNode root,int key){
        if(root==null) return null;
        if(key<root.val){
            root.left = solve(root.left,key);
        }else if(key>root.val){
            root.right = solve(root.right,key);
        }else{
            if(root.left==null){
                return root.right;
            }

            if(root.right==null){
                return root.left;
            }

            TreeNode min = find(root.right);
            root.val = min.val;
            root.right = solve(root.right,min.val);
        }
        return root;
    }
    static TreeNode find(TreeNode head){
        while(head.left!=null){
            head = head.left;
        }
        return head;
    }
}