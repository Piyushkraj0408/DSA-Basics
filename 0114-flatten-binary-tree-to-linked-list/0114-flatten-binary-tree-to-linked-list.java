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
    public void flatten(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        solve(root,list);
        TreeNode curr = root;
        for(int i=1;i<list.size();i++){
            curr.left=null;
            curr.right = list.get(i);
            curr = curr.right;
        }
    }
    static void solve(TreeNode root,List<TreeNode> list){
        if(root!=null){
            list.add(root);
            solve(root.left,list);
            solve(root.right,list);
        }
    }
}