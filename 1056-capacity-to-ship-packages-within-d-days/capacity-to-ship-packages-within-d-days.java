class Solution {
    public int shipWithinDays(int[] weights, int days) {
       int low = 0, high = 0;
       for(int i = 0; i < weights.length; i++){
           low = Math.max(low, weights[i]);
           high = high + weights[i];
       } 
       int ans = 0; // Answer store karne ke liye variable
       while(low <= high){
           int mid = low + (high - low) / 2; // guessed capacity
           int reqdays = 1;
           int totalweight = 0;
           
           // 1. Yahan array par chalne ke liye 'for' loop aayega!
           for(int i = 0; i < weights.length; i++){
               if(totalweight + weights[i] <= mid){
                   totalweight += weights[i]; // jodte jao jab tak space hai
               }
               else{
                   // agar space nahi hai
                   reqdays++; // spelling theek ki (reqday -> reqdays)
                   totalweight = weights[i]; // jo reh gaya tha waha se shuru karo
               }
           }
           
           // 2. Yeh checks ab 'for' loop ke KHATAM hone ke baad aayenge (while loop ke andar)
           if(reqdays <= days){
               ans = mid;     // good hai, par aur minimum dhoondne ke liye store kar lo
               high = mid - 1;
           }
           else{
               low = mid + 1;
           }
       }
       return ans;
    }
}