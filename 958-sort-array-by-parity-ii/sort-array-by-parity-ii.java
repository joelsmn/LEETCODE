class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n=nums.length,e=0,o=1;

        int arr[] = new int [n];

        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                arr[e]=nums[i];
                e+=2;
            }
            else{
                arr[o]=nums[i];
                o+=2;
            }
        }

        return arr;
    }
}