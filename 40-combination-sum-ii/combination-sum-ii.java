class Solution {
    public  void solve(int arr[],int index,int target,int sum,List<Integer>temp,List<List<Integer>>ans){

        //index=i+1 indicate move to next element for loop start with index at 0


        if(sum==target){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(sum>target){
            return;
        }

        //used i=index to start from new combo not repeat like[1,2]==[2,1]

        for(int i=index;i<arr.length;i++){
            //no repeated combo
            if(i>index && arr[i]==arr[i-1]) continue;
            temp.add(arr[i]);
            solve(arr,i+1,target,sum+arr[i],temp,ans);
            //i+1 to avoid using same no
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        Arrays.sort(arr);
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        solve(arr,0,target,0,temp,ans);
        return ans;
    }
}