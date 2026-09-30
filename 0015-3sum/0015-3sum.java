class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int i=0;
        int n = nums.length;
        Arrays.sort(nums);
        while(i<n-2){
            if (i > 0 && nums[i] == nums[i - 1]) {
                i++;
                continue;
            }
            int k = i+1;
            int j = n-1;
            while(k<j){
            int sum = nums[i]+nums[k]+nums[j];
            if(sum==0){
                List<Integer> list = new ArrayList<>();
                list.add(nums[i]);
                list.add(nums[k]);
                list.add(nums[j]);
                ans.add(list);

            while(k<j && nums[k]==nums[k+1]){
                k++;
            }
            while(k<j && nums[j]==nums[j-1]){
                j--;
            }
            k++;
            j--;
            }else if(sum<0){
                k++;
            }else{
                j--;
            }
        }
            i++;
        }
        return ans;
    }
}