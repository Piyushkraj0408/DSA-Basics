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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        q.offer(root);
        boolean flag = false;
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> tempo = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode tempi = q.poll();
                tempo.add(tempi.val);
                if(tempi.left!=null){
                    q.offer(tempi.left);
                }
                if(tempi.right!=null){
                    q.offer(tempi.right);
                }
        }
        if(flag){
            Collections.reverse(tempo);
            }
        ans.add(tempo);
        flag = !flag;
        }
        return ans;
    }
}