package greedy.minSpanning;
import java.util.*;
public class primsAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        boolean[] vis = new boolean[n];
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b)->a[0]-b[0]
        );
        pq.add(new int[]{0,0});
        int cost = 0;
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int wt = curr[0];
            int u = curr[1];
            if(vis[u]) continue;
            vis[u] = true;
            cost+=wt;
            for(int i=0;i<n;i++){
                if(arr[u][i]!=0 && !vis[i]){
                    pq.add(new int[]{arr[u][i],i});
                }
            }
        }
        System.out.println(cost);
        sc.close();
    }
}
