class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int x:arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        ArrayList<Integer>list=new ArrayList<>(map.values());
        Collections.sort(list);
        for(int i=0;i<list.size()-1;i++){
            int a=list.get(i);
            int b=list.get(i+1);
            if(a==b){
                return false;
            }
        }
        return true;
    }
}