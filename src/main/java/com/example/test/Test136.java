package com.example.test;

import java.util.Arrays;

public class Test136 {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(i+1<nums.length&&nums[i]==nums[i+1])
            {
                i++;
                continue;
            }
            else
                return nums[i];
        }
        return nums[nums.length-1];
    }
}
