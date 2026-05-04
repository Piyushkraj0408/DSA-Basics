package revision.sort;

public class counting {
    static void countsort(int n,int[] arr){
        int max = -1;
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }

        int[] count = new int[max+1];
        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }

        int k=0;
        for(int i=0;i<=max;i++){
            while(count[i]>0){
                arr[k++] = i;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int n=6;
        int[] arr = {5,4,3,2,1,0};
        countsort(n,arr);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
    }

    }
}
