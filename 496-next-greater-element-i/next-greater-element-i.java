class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int m= nums1.length;
        int n= nums2.length;

        for(int i=0;i<m;i++){
            int curr=nums1[i];
            int idx;
            for(int j=0;j<n;j++){
                if(nums2[j]==curr){
                    idx=j;
                    if(idx==n-1){
                        nums1[i]=-1;
                        break;
                    }
                    for(int k=idx+1;k<n;k++){
                        if(nums2[k]>curr){
                            nums1[i]=nums2[k];
                            break;
                        }
                        nums1[i]=-1;
                    }
                }
            }
        } 
        return nums1;
    }
}