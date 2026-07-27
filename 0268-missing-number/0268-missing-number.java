class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=n*(n+1)/2;
        int totalsum=0;
        for(int num:nums)
            totalsum+=num;
        return sum-totalsum;
        

    }
}