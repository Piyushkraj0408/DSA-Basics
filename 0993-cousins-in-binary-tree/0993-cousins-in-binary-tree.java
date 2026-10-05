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
    static int depthX=0;
    static int depthY = 0;
    static TreeNode parentx = null;
    static TreeNode parenty = null;
    public boolean isCousins(TreeNode root, int x, int y) {
        find(root,x,y,0,null);
        return depthX==depthY && parentx!=parenty;
    }
    static void find(TreeNode root,int x,int y,int depth,TreeNode parent){
        if(root==null) return;
        if(root.val==x){
            depthX = depth;
            parentx = parent;
        }
        if(root.val==y){
            depthY = depth;
            parenty = parent;
        }
        find(root.left,x,y,depth+1,root);
        find(root.right,x,y,depth+1,root);
    }
}