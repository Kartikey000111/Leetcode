class Solution {
    public int longestPalindrome(String s) {
        int freq[]= new int[128];
        for(char c:s.toCharArray()){
            freq[c]++;
        }
        int ans=0;
        boolean odd=false;
        for(int count:freq){
            if(count%2==0){
                ans+=count;
            }else{
                ans+=count-1;
                odd=true;
            }
        }
        if(odd){
            ans++;
        }
        return ans;
        
    }
}