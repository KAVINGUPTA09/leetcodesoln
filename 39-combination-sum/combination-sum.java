class Solution {
    public static void solve(int candidates[],int index,int target,int sum,List<Integer>temp,List<List<Integer>>ans){
        //base case
        if(sum==target){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(sum>target){
            return;
        }
            
            //ab ek ek element lete jao aur loop i=index se to avoid same combos
        //and same elemeent is alloeed again
        for(int i=index;i<candidates.length;i++){
            temp.add(candidates[i]);
            solve(candidates,i,target,sum+candidates[i],temp,ans);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        solve(candidates,0,target,0,temp,ans);
        return ans;
    }
}