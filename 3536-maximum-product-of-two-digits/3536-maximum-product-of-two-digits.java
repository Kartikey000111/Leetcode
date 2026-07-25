class Solution {
    public int maxProduct(int n) {
        int n1=0,n2=0;
        while(n>0){
            int d=n%10;
            if(d>=n1){
                n2=n1;
                n1=d;
            }else if(d>n2){
                n2=d;
            }
            n=n/10;
        }
        return n1*n2;
        
    }
}