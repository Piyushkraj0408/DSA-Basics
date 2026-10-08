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
    static List<Integer> list;
    public List<Integer> largestValues(TreeNode root) {
        list = new ArrayList<>();
        solve(root,0);
        return list;
    }
    static void solve(TreeNode root,int lvl){
        if(root==null)return;

        if(lvl==list.size()){
            list.add(root.val);
        }else{
            list.set(lvl,Math.max(root.val,list.get(lvl)));
        }
        solve(root.left,lvl+1);
        solve(root.right,lvl+1);
    }
}