class Solution {
    public void solve(int index,String temp,List<String>ans,String digits,HashMap<Character,String>mp){

        //base case
        if(temp.length()==digits.length()){
            ans.add(temp);
            return;
        }

        char ch=digits.charAt(index);
        String letters=mp.get(ch);


        //main case start hovering over each letter of first digit of string add it then move main index by 1 
        for(int i=0;i<letters.length();i++){
            temp=temp+letters.charAt(i);
            solve(index+1,temp,ans,digits,mp);
            temp=temp.substring(0,temp.length()-1);
        }

    }
    public List<String> letterCombinations(String digits) {
        List<String>ans=new ArrayList<>();
        String temp="";
        HashMap<Character,String>mp=new HashMap<>();

        mp.put('2', "abc");
        mp.put('3', "def");
        mp.put('4', "ghi");
        mp.put('5', "jkl");
        mp.put('6', "mno");
        mp.put('7', "pqrs");
        mp.put('8', "tuv");
        mp.put('9', "wxyz");

        solve(0,"",ans,digits,mp);
        return ans;
    }
}