class Solution {
    public void solve(int k,int index,int n,int sum,List<Integer>temp,List<List<Integer>>ans){
        if(temp.size()==k){
            if(sum==n){
                //n target
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
//i =index because [1,2] and [2,1] same [1,2,6] and [6,2,1] same
        for(int i=index;i<=9;i++){
        temp.add(i);
        //and if(i>index) not valid wo tb ki ek elm kai bar ho yaha to at most haimtlb ek hi bar use hoga
        solve(k,i+1,n,sum+i,temp,ans);
        temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        solve(k,1,n,0,temp,ans);
        return ans;
    }

}