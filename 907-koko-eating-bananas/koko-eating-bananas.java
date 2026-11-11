
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int high=0;
        for(int i=0;i<piles.length;i++){
            high=Math.max(high,piles[i]);
        }
        int low=1;
        int ans=0;
        while(low<=high){
            int k=low+(high-low)/2;
            long hours=0;
            for(int i=0;i<piles.length;i++){
                hours+=piles[i]/k;
                if(piles[i]%k!=0){
                    hours++;
                }
            }
            if(hours<=h){
                ans=k;
                high=k-1;
            }
            else{
                low=k+1;
            }
        }
        return ans;
    }
}
