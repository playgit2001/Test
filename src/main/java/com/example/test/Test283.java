package com.example.test;

public class Test283 {
    public void moveZeroes(int[] nums) {
        int tp=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {nums[tp]=nums[i];
                tp++;
            }
        }
        for(int i=tp;i<nums.length;i++)
            nums[i]=0;
    }
}
