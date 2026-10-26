class Solution {
    public int findPeakElement(int[] arr) {
        int low=0;
        int ans=-1;
        int high=arr.length;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid<arr.length-1 && arr[mid]<arr[mid+1]){
                low=mid+1;
            }
            else{
                //mtlb peak right me chance hai
                ans=mid;
                high=mid-1;
            }
        }
        return ans;
    }
}