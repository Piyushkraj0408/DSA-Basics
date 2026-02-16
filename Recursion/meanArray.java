package Recursion;

public class meanArray {
    static int mean1(int[] arr,int i,int j){
        if(i==j){
            return arr[i];
        }
        return arr[i]+mean1(arr, i+1, j);
    }
    public static void main(String[] args) {
        int[] arr = {2,5,3,4,2,6,7,8,4};
        int avg = mean1(arr,0,arr.length-1);
        System.out.println((float)avg/arr.length);
    }
}
