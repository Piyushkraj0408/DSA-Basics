import java.util.Scanner;

public class TSM {
    static int[] temp;
    static int[] best;
    static int mincost = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] graph = new int[n][n];
        int[] vis = new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                graph[i][j]=sc.nextInt();
            }
            vis[i]=-1;
        }
        temp = new int[n+1];
        best = new int[n+1];
        temp[0]=0;
        vis[0]=1;
        int cost =0;
        solve(0,1,cost,graph,vis,n);
        for(int i=0;i<n;i++){
            System.out.print(best[i]+" ");
        }
        System.out.println(mincost);
    }
    static void solve(int start,int level,int cost,int[][] graph,int[] vis,int n){
        if(level==n){
            cost += graph[start][0];
            if(cost<mincost){
                mincost=cost;
                for(int i=0;i<n;i++){
                    best[i]=temp[i];
                }
            }
            return;
        }
        for(int i=0;i<n;i++){
            if(vis[i]==-1){
                vis[i]=1;
                temp[level]=i;
                solve(i,level+1,cost+graph[start][i],graph,vis,n);
                vis[i]=-1;
                temp[level]=-1;
            }
                
        }
    }
}
