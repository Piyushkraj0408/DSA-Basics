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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int c=0;
        while(!q.isEmpty()){
            int size = q.size();
            int prev = c%2==0 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            for(int i=0;i<size;i++){
                TreeNode temp = q.poll();
                int x = temp.val;
            if(c%2==0){
                if(x%2==0 || x<=prev){
                    return false;
                }
            }else{
                if(x%2!=0 || x>=prev)
                return false;
            }
            prev=x;
                if(temp.left!=null){
                    q.offer(temp.left);
                }
                if(temp.right!=null){
                    q.offer(temp.right);
                }
            }
            c++;
        }
        return true;
    }
}