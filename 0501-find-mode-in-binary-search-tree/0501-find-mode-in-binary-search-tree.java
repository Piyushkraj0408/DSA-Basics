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
    private static int maxc=0;
    private static int currc = 0;
    private static ArrayList<Integer> mode = new ArrayList<>();
    private static Integer prev =null;
    public int[] findMode(TreeNode root) {
        maxc = 0;
        currc = 0;
        mode.clear();
        prev = null;
        solve(root);
        int[] ans = new int[mode.size()];
        for(int i=0;i<mode.size();i++){
            ans[i] = mode.get(i);
        }
        return ans;
    }
    static void solve(TreeNode root){
        if(root==null) return;
        solve(root.left);

        if(prev!=null && prev==root.val){
            currc++;
        }else{
            currc=1;
        }

        if(currc>maxc){
            maxc=currc;
            mode.clear();
            mode.add(root.val);
        }else if(currc==maxc){
            mode.add(root.val);
        }
        prev = root.val;
        solve(root.right);

    }
}