class Solution {
    public String reverseWords(String s) {
        String words[]=s.trim().split("\\s+");
        //trim space niklata split Yeh line string ke aage-peeche ke faltu spaces hata kar, beech ke saare multiple spaces ko ignore karte hue sirf asli words ka saaf array bana deti hai.
        Stack<String>st=new Stack<>();
        for(char i=0;i<words.length;i++){
            st.push(words[i]);
        }
        String ans="";
        while(!st.isEmpty()){
            ans=ans+st.pop();
            //agar khali nhi hua hai abhi to space dete jao usse
            if(!st.isEmpty()){
                ans=ans+" ";
            }
        }
        return ans;
    }
}