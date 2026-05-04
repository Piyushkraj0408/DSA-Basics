package revision.sort;

public class shellsort {
    static void shellsort(int n,int[] arr){
        for(int gap=n/2;gap>0;gap/=2){
            for(int j=gap;j<n;j++){
                for(int i=j-gap;i>=0;i-=gap){
                    if(arr[i+gap]<arr[i]){
                        int temp = arr[i+gap];
                        arr[i+gap] = arr[i];
                        arr[i] = temp;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int n = 7;
        int[] arr = {23,12,45,3,9,18,30};
        shellsort(n,arr);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
