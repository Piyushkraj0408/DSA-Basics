package revision.sort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class bucketing {
    static void bucketsort(int n,double[] arr){
        ArrayList<Double>[] vis = new ArrayList<Double>[n];
        for(int i=0;i<n;i++){
            vis[i]= new ArrayList<>();
        }

        for(int i=0;i<n;i++){
            int dig = (int)(arr[i]*n);
            vis[dig].add(arr[i]);
        }

        for(int i=0;i<n;i++){
            Collections.sort(vis[i]);
        }

        int k=0;
        for(int i=0;i<n;i++){
            for(double num:vis[i]){
                arr[k++] = num;
            }
        }
    }
    public static void main(String[] args) {
        int n = 4;
        double[] arr={0.98,0.76,0.54,0.12};
        bucketsort(n,arr);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
