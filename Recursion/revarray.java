package Recursion;

public class revarray {
    static void rev1(int[] arr,int i,int j){
        if(i>j){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        rev1(arr, i+1, j-1);
    }
    public static void main(String[] args) {
        int[] arr = {2,6,5,8,9,7,3};
        rev1(arr,0,arr.length-1);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
