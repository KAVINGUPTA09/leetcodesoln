class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>list=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<=n-3;i++){
            // “because we need at least 3 elements for a triplet”
            int l=i+1;
            int r=n-1;
            if(i>0 && nums[i]==nums[i-1]) continue;//because using same i gives same triplet
            while(l<r){
                int sum=nums[i]+nums[l]+nums[r];
                if(sum==0){
                    list.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    r--;
                    while(l<r && nums[l]==nums[l-1]) l++;//skip same
                    while(l<r && nums[r]==nums[r+1]) r--;
                }
                else if(sum<0){
                    l++;
                }
                else{
                    r--;
                }
            }
        }
        return list;
    }
}