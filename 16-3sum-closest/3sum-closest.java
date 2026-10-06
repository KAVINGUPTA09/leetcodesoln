class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        int mindiff=Integer.MAX_VALUE;
        int closest=0;
        //min diff ke liye
        Arrays.sort(nums);
        for(int i=0;i<=n-3;i++){
            int l=i+1;
            int r=n-1;
            while(l<r){
                int sum=nums[i]+nums[l]+nums[r];
                if(sum==target){
                    return target;
                }
                if(Math.abs(sum-target)<mindiff){
                    mindiff=Math.abs(sum-target);
                    closest=sum;
                }
                if(sum<target){
                    l++;
                }
                else{
                    r--;
                }
            }
        }
        return closest;
    }
}