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
class Tuple{
    int row;
    int col;
    TreeNode root;
    Tuple(int row,int col,TreeNode root){
        this.row = row;
        this.col = col;
        this.root = root;
    }
}
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Tuple> q = new LinkedList<Tuple>();
        q.offer(new Tuple(0,0,root));
        while(!q.isEmpty()){
            Tuple tuple = q.poll();
            int x = tuple.row;
            int y = tuple.col;
            TreeNode tempi=tuple.root;

            if(!map.containsKey(y)){
                map.put(y,new TreeMap<>());
            }
            if(!map.get(y).containsKey(x)){
                map.get(y).put(x,new PriorityQueue<>());
            }
            map.get(y).get(x).offer(tempi.val);

            if(tempi.left!=null){
                q.offer(new Tuple(x+1,y-1,tempi.left));
            }
            if(tempi.right!=null){
                q.offer(new Tuple(x+1,y+1,tempi.right));
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(TreeMap<Integer,PriorityQueue<Integer>> v:map.values()){
            List<Integer> tempo = new ArrayList<>();
            for(PriorityQueue<Integer> pq:v.values()){
                while(!pq.isEmpty()){
                    tempo.add(pq.poll());
                }
            }
            ans.add(tempo);
        }
        return ans;
    }
}