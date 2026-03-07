package sorting;
import java.util.Scanner;
public class shellsort {
    static void shell(int[] arr,int n){
        int count = 0;
        for(int gap=n/2;gap>0;gap/=2){
            for(int j=gap;j<n;j++){
                for(int i=j-gap;i>=0;i-=gap){
                    if(arr[i+gap]<arr[i]){
                        count++;
                        int temp = arr[i];
                        arr[i]=arr[i+gap];
                        arr[i+gap]=temp;
                    }
                }
            }
        }
        System.out.println(count+" is the all swaps");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        shell(arr,n);
        for(int i=0;i<n;i++) System.out.printf(arr[i]+" ");
    }
}
