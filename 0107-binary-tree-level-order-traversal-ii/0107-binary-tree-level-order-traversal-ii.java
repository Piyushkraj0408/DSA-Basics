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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root==null)
        return new ArrayList<>();

        List<List<Integer>> ans = new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<size;i++){
            TreeNode tempo = q.poll();
            list.add(tempo.val);
            if(tempo.left!=null)
            q.offer(tempo.left);
            if(tempo.right!=null)
            q.offer(tempo.right);                
            }
            ans.add(list);
        }
        Collections.reverse(ans);
        return ans;
    }
}