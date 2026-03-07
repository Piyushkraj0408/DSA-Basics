package sorting;

import java.util.Scanner;

public class radixSort {
    static int getmax(int[] arr,int n){
        int max = -1;
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    static void counting(int[] arr,int n,int exp){
        int[] count = new int[10];
        int[] output = new int[n];

        for(int i=0;i<n;i++){
            count[(arr[i]/exp)%10]++;
        }

        for(int i=1;i<10;i++){
            count[i] += count[i-1];
        }

        for(int i=n-1;i>=0;i--){
            int dig = (arr[i]/exp)%10;
            output[count[dig]-1] = arr[i];
            count[dig]--;
        }

        for(int i=0;i<n;i++){
            arr[i] = output[i];
        }
    }
    static void radix(int[] arr,int n){
        int max = getmax(arr,n);
        for(int exp=1;max/exp>0;exp*=10){
            counting(arr,n,exp);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        radix(arr,n);
        for(int i=0;i<n;i++) System.out.printf(arr[i]+" ");
        sc.close();
    }
}
