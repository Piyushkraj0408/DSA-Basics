package sorting;
import java.util.*;
public class bucketSort {
    static void bucket(float[] arr,int n){
        ArrayList<Float>[] buckets = new ArrayList[n];

        for(int i=0;i<n;i++){
            buckets[i] = new ArrayList<>();
        }

        for(int i=0;i<n;i++){
            int dig = (int)(arr[i]*n);
            buckets[dig].add(arr[i]);
        }

        for(int i=0;i<n;i++){
            Collections.sort(buckets[i]);
        }

        int k=0;
        for(int i=0;i<n;i++){
            for(float num:buckets[i]){
                arr[k++] = num;
            }
        }
    }
    public static void main(String[] args) {

        float arr[] = {0.78f,0.12f,0.45f,0.32f,0.99f};
        int n = arr.length;

        bucket(arr, n);

        for (float num : arr)
            System.out.print(num + " ");
    }
}
