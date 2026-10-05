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
    static int preidx;
    static Map<Integer,Integer> map;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preidx=0;
        map = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }

        return solve(0,inorder.length-1,preorder);
        
    }
    static TreeNode solve(int low,int high,int[] preorder){
        if(low>high){
            return null;
        }

        int val = preorder[preidx++];
        TreeNode root = new TreeNode(val);

        int rootidx = map.get(val);

        root.left = solve(low,rootidx-1,preorder);
        root.right = solve(rootidx+1,high,preorder);
        return root;
    }
}