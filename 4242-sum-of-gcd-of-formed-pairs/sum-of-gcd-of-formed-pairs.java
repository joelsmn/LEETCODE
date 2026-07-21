class Solution {

    public int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }

    public long gcdSum(int[] nums) {
        int n=nums.length;
        int [] p= new int[n];
        int max=0;

        for(int i=0;i<n;i++){
            if(nums[i]>max) max=nums[i];
            p[i]=gcd(nums[i],max);
        }

        Arrays.sort(p);
        int i=0,j=n-1;
        long sum=0;

        while(i<j){
            sum+=gcd(p[i],p[j]);
            i++;j--;
        }
        return sum;
    }
}