class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
     int low=1;
     int high=0;
     for(int i=0;i<nums.length;i++){
        high=Math.max(high,nums[i]);
     }
     int ans=0;
     while(low<=high){
        int mid=low+(high-low)/2;
        int totalsum=0;
        for(int i=0;i<nums.length;i++){
            totalsum += (nums[i] + mid - 1) / mid;
            //ceil value
            //totalsum+=nums[i]/mid;
            //if(nums[i]%mid!=0){
            //totalsum++;}
        }
        if(totalsum<=threshold){
            ans=mid;
            high=mid-1;
        }
        else{
            low=mid+1;
        }
     }
     return ans;
    }
}