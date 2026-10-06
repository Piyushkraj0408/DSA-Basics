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
    private Map<Integer, Integer> map = new HashMap<>();
    private int maxFreq = 0;

    public int[] findFrequentTreeSum(TreeNode root) {
        dfs(root);
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxFreq) {
                list.add(entry.getKey());
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    private int dfs(TreeNode node) {
        if (node == null) return 0;
        int sum = node.val + dfs(node.left) + dfs(node.right);
        int freq = map.getOrDefault(sum, 0) + 1;
        map.put(sum, freq);
        maxFreq = Math.max(maxFreq, freq);
        return sum;
    }
}