package revision.sort;

public class radixsort {
    static int getmax(int n,int[] arr){
        int max = -1;
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    static void counting(int n, int[] arr,int exp){
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
            output[count[dig]-1]=arr[i];
            count[dig]--;
        }

        for(int i=0;i<n;i++){
            arr[i] = output[i];
        }
    }
    static void radixsorting(int n,int[] arr){
        int max = getmax(n,arr);
        for(int exp=1;max/exp>0;exp*=10){
            counting(n,arr,exp);
        }
    }
    public static void main(String[] args) {
        int n = 6;
        int[] arr = {329,457,657,839,436,720};
        radixsorting(n,arr);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
