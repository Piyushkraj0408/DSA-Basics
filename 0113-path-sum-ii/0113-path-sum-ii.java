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
    static List<List<Integer>> ans;
    static List<Integer> list;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        ans = new ArrayList<>();
        list = new ArrayList<>();
        solve(root,targetSum,0);
        return ans;
    }
    static void solve(TreeNode root,int targetSum,int sum){
        if(root==null) return;
        list.add(root.val);
        sum+=root.val;
        if(root.left==null && root.right==null){
        if(sum==targetSum){
            ans.add(new ArrayList<>(list));
        }
        }
        solve(root.left,targetSum,sum);
        solve(root.right,targetSum,sum);
        list.remove(list.size()-1);
    }
}