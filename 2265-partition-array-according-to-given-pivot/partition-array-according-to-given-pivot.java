class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] ans = new int[n];

        int idx = 0;

        //Add the smaller elements compared to pivot
        for (int num : nums) {      
            if (num < pivot) {
                ans[idx++] = num;
            }
        }
        //Add the elements equal to pivot
        for (int num : nums) {
            if (num == pivot) {
                ans[idx++] = num;
            }
        }

        //Add the larger elements compared to pivot
        for (int num : nums) {
            if (num > pivot) {
                ans[idx++] = num;
            }
        }

        return ans;
    }
}