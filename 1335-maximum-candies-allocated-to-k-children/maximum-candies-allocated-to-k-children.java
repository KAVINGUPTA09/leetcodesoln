class Solution {
    public int maximumCandies(int[] candies, long k) {
        long low=1;
        long high=0;
        for(int i=0;i<candies.length;i++){
            high=Math.max(high,candies[i]);
        }
        long ans=0;
        long sum=0;
        for(int i=0;i<candies.length;i++){
            sum=sum+candies[i];
        }
        if(sum<k){
            return 0;
        }
        while(low<=high){
            long mid=low+(high-low)/2;
            long x=0;
            for(int i=0;i<candies.length;i++){
            x+=candies[i]/mid;
            }
            if(x>=k){
                ans=mid;
                
                 low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return (int) ans;
    }
}