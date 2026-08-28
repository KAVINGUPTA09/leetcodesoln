class Solution {
    //boolean used to be used here mtlb ek no us eto ek permutaion me phirse usse use nhi kr skyte hai....
    public void solve(int []nums,int index,List<Integer>temp,List<List<Integer>>ans,boolean used[]){
        //base case
        if(temp.size()==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        //simple ek elem lo check kro used hai ki nhi aur aage badhte jao
        for(int i=0;i<nums.length;i++){
            if(used[i]) continue;
            //dupliacte treating no duplicate combos
            if(i>0 && nums[i]==nums[i-1] && !used[i-1]) continue;

            temp.add(nums[i]);
            used[i]=true;
            solve(nums,index+1,temp,ans,used);
            used[i]=false;
            //no use
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<Integer>temp=new ArrayList<>();
        List<List<Integer>>ans=new ArrayList<>();
        boolean used[]=new boolean[nums.length];
        solve(nums,0,temp,ans,used);
        return ans;
    }
}