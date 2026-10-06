class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        int mindiff=Integer.MAX_VALUE;
        Arrays.sort(nums);
        int closestsum=0;
        for(int i=0;i<=n-3;i++){
            //n-3 as 3 sum
            int l=i+1;
            int r=n-1;
            while(l<r){
                int currentsum=nums[i]+nums[l]+nums[r];
                if(currentsum==target){
                    return target;
                }
                if(Math.abs(currentsum-target)<mindiff){
                    mindiff=Math.abs(currentsum-target);
                    closestsum=currentsum;
                }
                if(currentsum<target){
                    l++;
                }
                else{
                    r--;
                }
            }
        }
        return closestsum;
    }
}