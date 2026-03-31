package greedy.minSpanning;
import java.util.*;
public class crucialAlgo {
    static int[] parent;
    static int[] rank;
    static int find(int x){
        if(parent[x]!=x){
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }
    static void union(int x,int y){
        int root_x = find(x);
        int root_y = find(y);
        if(root_x==root_y){
            return;
        }else if(rank[root_x]>rank[root_y]){
            parent[y] = root_x;
        }else if(rank[root_x]<rank[root_y]){
            parent[x] = root_y;
        }else{
            parent[y] = root_x;
            rank[root_x]++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        int[][] arr = new int[e][3];
        for(int i=0;i<e;i++){
            for(int j = 0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int cost = 0;
        parent = new int[v];
        rank = new int[v];
        for(int i=0;i<v;i++){
            parent[i]=i;
            rank[i] = 0;
        }
        Arrays.sort(arr,(a,b)->Integer.compare( a[2],b[2]));
        for(int[] i:arr){
            int u1 = i[0];
            int v1 = i[1];
            int wt = i[2];
            if(find(u1)!=find(v1)){
                union(u1,v1);
                cost+=wt;
            }
        }
        System.out.println(cost);
        sc.close();
    }
}
