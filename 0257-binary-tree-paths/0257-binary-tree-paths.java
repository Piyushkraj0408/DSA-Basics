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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        solve(root,"",ans);
        return ans; 
    }
    static void solve(TreeNode root,String store,List<String> ans){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            ans.add(store+root.val);
            return;
        }
        store = store+root.val+"->";
        solve(root.left,store,ans);
        solve(root.right,store,ans);
    }
}