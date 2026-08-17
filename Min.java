public class Min {
    public static void main(String[] args){
        int[] arr = {1,4,5,1};

        // for(int i=0,j=arr.length-1;i<arr.length && j>=0 && i<=j;i++,j--){
        //     if(arr[i]==arr[j]){
        //         System.out.println("it is already paindrome");
        //         return;
        //     }
        // }

        int i=0,j=arr.length-1;
        int count=0;
        while(i<j){
            if(arr[i]>arr[j]){
                arr[j-1]=arr[j]+arr[j-1];
                j--;
                count++;
            }else if(arr[i]<arr[j]){
                arr[i+1] = arr[i+1]+arr[i];
                i++;
                count++;
            }else{
                i++;
                j--;
            }
        }

        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }
        System.out.println(count);
    }
}
