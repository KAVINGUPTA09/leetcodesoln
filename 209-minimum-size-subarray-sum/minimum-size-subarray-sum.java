class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int h=0;
        int minlen=Integer.MAX_VALUE;
        int sum=0;
        int n=nums.length;
        while(h<n){
        sum=sum+nums[h];
        while(sum>=target){
            int len=h-l+1;
            if(len<minlen){
            minlen=len;
            }
            sum = sum - nums[l];
             l++;
        }
        h++;
        }
        if(minlen==Integer.MAX_VALUE){
            return 0;
        }
        else{
            return minlen;
        }
    }
}