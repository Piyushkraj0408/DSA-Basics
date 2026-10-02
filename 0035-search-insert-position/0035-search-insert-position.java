class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length-1;
        int f=0;
        while (f <= n) {
            int mid = f+(n-f) / 2;
            
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                f = mid + 1;
            } else {
                n = mid - 1; 
            }
        }
        return f;
        
    }
}
