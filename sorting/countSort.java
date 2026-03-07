package sorting;

import java.util.Scanner;

public class countSort {
    static void count(int[] arr,int n){
        int max = 0;
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        int count[] = new int[max+1];
        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }

        int idx = 0;
        for(int i=0;i<=max;i++){
            while(count[i]>0){
                arr[idx++] = i;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        count(arr,n);
        for(int i=0;i<n;i++) System.out.printf(arr[i]+" ");
    }
}
