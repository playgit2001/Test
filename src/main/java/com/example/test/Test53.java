package com.example.test;

public class Test53 {
    public int maxSubArray(int[] nums) {
        int length=nums.length;
        int[] dp=new int[length];
        dp[0]=nums[0];
        if(length==1)return dp[0];
        for(int i=1;i<length;i++)
            dp[i]=(dp[i-1]+nums[i])>nums[i]?dp[i-1]+nums[i]:nums[i];
        int max=dp[0];
        for(int i=0;i<length;i++)
            if(dp[i]>max)max=dp[i];
        return max;
    }
}
