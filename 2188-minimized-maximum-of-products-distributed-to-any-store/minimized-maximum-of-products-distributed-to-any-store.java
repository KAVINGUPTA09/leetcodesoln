class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int low=1;
        int high=0;
        int ans=0;
        for(int i=0;i<quantities.length;i++){
            high=Math.max(high,quantities[i]);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            //now used this guessed mid to check how much store are required to form up
            int total=0;
            for(int i=0;i<quantities.length;i++){
                total+=(quantities[i]+mid-1)/mid;
            }
            if(total<=n){
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