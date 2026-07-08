class Solution {
    public long sumAndMultiply(int n) {
        int sum=0;
        long dsum=0;
        while(n>0){
            int d=n%10;
            if(d!=0){
                sum = sum * 10 + d;
                dsum+=d;

            }
            n=n/10;

        }
        long ans=0;
        while(sum>0){
            int temp=sum%10;
            ans=ans*10+temp;
            sum=sum/10;
            
        }
        return ans*dsum;
        
    }
}