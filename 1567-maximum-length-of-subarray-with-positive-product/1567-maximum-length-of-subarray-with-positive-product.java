class Solution {
    public int getMaxLen(int[] nums) {
        int n=nums.length;
        int max = 0;
        int poscount=0;
        int negcount=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                poscount=0;
                negcount=0;
            }else if(nums[i]>0){
                poscount++;
                negcount=(negcount == 0) ?0:negcount+1;
            }else{
                int temp = poscount;
                poscount = (negcount == 0) ? 0 : negcount + 1;
                negcount = temp + 1;
            }
            max = Math.max(max,poscount);
        }
        return max;
    }
}