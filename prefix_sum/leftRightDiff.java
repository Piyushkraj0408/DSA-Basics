package prefix_sum;

public class leftRightDiff {
    public static void main(String[] args) {
        int[] nums = {10,4,8,3};
        System.out.println(leftRightDifference(nums));
    }
    static int[] leftRightDifference(int[] nums){
         int[] res = new int[nums.length];
        int total = 0;
        if(nums.length==1){
            res[0]=0;
            return res;
        }
        for(int num:nums){
            total +=num;
        }

        int left = nums[0];
        for(int i=1;i<nums.length;i++){
            int right = total - left + nums[i-1];

            res[i-1] = Math.abs(right-left);
            left += nums[i];
        }
        res[nums.length-1] = Math.abs(total-left+nums[nums.length-1]-left);
        return res;
    }
}
