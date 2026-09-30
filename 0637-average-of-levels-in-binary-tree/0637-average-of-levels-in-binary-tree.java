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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        ArrayList<Double> list = new ArrayList<>();
        double avg=0;
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode temp = q.poll();

                if(temp.left!=null){
                    q.offer(temp.left);
                }

                if(temp.right!=null){
                    q.offer(temp.right);
                }
                avg+=temp.val;
            }
            avg=avg/size;
            list.add(avg);
            avg=0;
        }
        return list;
    }
}