class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        long sum = 0;
        long maxsum = 0;
        int l =0;
        for(int r=0;r<nums.length;r++){
            while(set.size()==k || set.contains(nums[r])){
                sum -= nums[l];
                set.remove(nums[l]);
                l++;
            }
            sum += nums[r];
            set.add(nums[r]);
            if(set.size()==k){
                maxsum = Math.max(maxsum,sum);
            }
        }
        return maxsum;
    }
}