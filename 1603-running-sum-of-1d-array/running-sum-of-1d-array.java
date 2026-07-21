class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int runningsum=0;
        for(int i=0;i<n;i++){
            runningsum+=nums[i];
            nums[i]=runningsum;
        }
        return nums;
    }
}