class Solution {
    public int searchInsert(int[] nums, int target) {
        int r = nums.length - 1;
        int l = 0;
        while(l <= r){
            int m = l + (r - l)/2;
            if(nums[m]==target){
                return m;
            }
            else if(nums[m]>target){
                r = m - 1;
            }else{
                l = m + 1;
            }
        }
        return l;  
    }
}