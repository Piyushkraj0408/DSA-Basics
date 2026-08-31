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
        if(root==null) return null;
        List<TreeNode> path1 = new ArrayList<>();
        List<TreeNode> path2 = new ArrayList<>();

        findpath(root,path1,p);
        findpath(root,path2,q);

        int i=0;
        while (i < path1.size() && i < path2.size()
        && path1.get(i) == path2.get(i)){
            i++;
        }
        return path1.get(i-1);
    }
    static boolean findpath(TreeNode root,List<TreeNode> path,TreeNode p){
        if(root==null) return false;
        path.add(root);
        if(root==p) return true;
        if(findpath(root.left,path,p) || findpath(root.right,path,p)){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
}