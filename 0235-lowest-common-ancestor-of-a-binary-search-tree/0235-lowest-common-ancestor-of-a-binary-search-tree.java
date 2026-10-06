/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> list1 = new ArrayList<>();
        List<TreeNode> list2 = new ArrayList<>();
        solve(root,p,list1);
        solve(root,q,list2);
        int i=0;
        TreeNode ans = null;
        while (i < list1.size() && i < list2.size()) {
            if (list1.get(i) != list2.get(i)) {
                break;
            }

            ans = list1.get(i);
            i++;
        }
        return ans;
    }
    static void solve(TreeNode root,TreeNode p,List<TreeNode> list){
        if(root==null)return;
        list.add(root);
        if(p.val<root.val){
            solve(root.left,p,list);
        }else if(p.val>root.val){
            solve(root.right,p,list);
        }else{
            return;
        }
    }
}