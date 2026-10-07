class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int i=0;
        int j=n-1;
        int totalwater=0;
        int left_max=height[i];
        int right_max=height[j];
        while(i<j){
            if(left_max<=right_max){
                //pani leftmax jitna hi bahrega
                totalwater+=(left_max-height[i]);
                i++;
                left_max=Math.max(left_max,height[i]);
            }
            else{
                totalwater+=(right_max-height[j]);
                j--;
                right_max=Math.max(right_max,height[j]);
            }
        }
        return totalwater;
    }
}