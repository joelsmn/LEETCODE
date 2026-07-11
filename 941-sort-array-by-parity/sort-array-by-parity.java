class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length,k=0;
        int arr [] = new int[n];

        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                arr[k]=nums[i];
                k++;
            }
        }

        for(int i=0;i<n;i++){
            if(nums[i]%2!=0){
                arr[k]=nums[i];
                k++;
            }
        }

        return arr;
    }
}