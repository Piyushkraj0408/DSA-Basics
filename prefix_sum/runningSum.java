public class runningSum {
    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        int[] res = runningSum(nums);
        for(int i:res){
            System.out.println(i+" ");
        }
    }
    static int[] runningSum(int[] nums){
        int[] arr = new int[nums.length];
        arr[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            arr[i] = arr[i-1]+nums[i]; 
        }
        return arr;
    }
}
