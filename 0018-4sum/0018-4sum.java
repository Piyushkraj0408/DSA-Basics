class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++){
        if(i > 0 && nums[i] == nums[i - 1])
        continue;
        for(int j=i+1;j<nums.length-2;j++){
        if(j > i + 1 && nums[j] == nums[j - 1])
        continue;
            int k=j+1;
            int p = n-1;
        while(k<p){
            long sum = (long)nums[i]+nums[j]+nums[k]+nums[p];
            if(sum==target){
                ans.add(Arrays.asList(
                    nums[i],
                    nums[j],
                    nums[k],
                    nums[p]
                ));
                k++;
                p--;
            while(k<p && nums[k]==nums[k-1]){
                k++;
            }
            while(k<p && nums[p]==nums[p+1]){
                p--;
            }
            }else if(sum<target){
                k++;
            }else{
                p--;
            }


        }
        }
        }
        return ans;
    }
}