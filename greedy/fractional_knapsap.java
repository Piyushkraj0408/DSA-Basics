package greedy;
import java.util.*;
public class fractional_knapsap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int[][] arr = new int[n][2];
        for(int i=0;i<n;i++){
            int price = sc.nextInt();
            int wt = sc.nextInt();
            arr[i][0] = price;
            arr[i][1] = wt;
        }

        Arrays.sort(arr,(a,b)->Double.compare((double)b[0]/b[1],(double)a[0]/a[1]));
        double cost = 0;
        for(int i=0;i<n;i++){
            if(w>=arr[i][1]){
                cost += arr[i][0];
                w-=arr[i][1];
            }else{
                cost += ((double)w/arr[i][1])*arr[i][0];
            }
        }
        System.out.println(cost);
        sc.close();
    }
}
