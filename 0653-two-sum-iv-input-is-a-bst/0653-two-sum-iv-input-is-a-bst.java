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
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        inorder(root,list);
        int size = list.size()-1;
        int i=0;
        while(i<size){
            int sum = list.get(i)+list.get(size);
            if(sum>k){
                size--;
            }else if(sum<k){
                i++;
            }else{
                return true;
            }
        }
        return false;
    }
    static void inorder(TreeNode root,List<Integer> list){
        if(root!=null){
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
        }
    }
}