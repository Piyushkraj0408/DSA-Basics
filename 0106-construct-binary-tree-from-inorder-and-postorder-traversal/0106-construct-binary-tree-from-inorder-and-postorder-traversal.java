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
    static int postidx;
    static Map<Integer,Integer> map;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postidx = postorder.length-1;
        map= new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }

        return solve(postorder,0,inorder.length-1);
    }
    static TreeNode solve(int[] postorder,int low,int high){
        if(low>high){
            return null;
        }
        int val = postorder[postidx--];
        TreeNode root = new TreeNode(val);

        int rootidx = map.get(val);
        root.right = solve(postorder,rootidx+1,high);
        root.left = solve(postorder,low,rootidx-1);

        return root;
    }
}