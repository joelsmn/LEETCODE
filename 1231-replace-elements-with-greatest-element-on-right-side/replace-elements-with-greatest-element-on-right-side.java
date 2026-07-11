class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int maxright=-1;

        //Traverse from right to solve in O(n) 
        //Traversing from L->R solves the problem in O(nxn)
        //get the current element in curr, Replace arr[i]=maxright, find the max of (curr, arr[i]) & store in maxright

        for(int i=n-1;i>=0;i--){
            int curr=arr[i];
            arr[i]=maxright;
            maxright=Math.max(curr,arr[i]);
        }

        return arr;
    }
}