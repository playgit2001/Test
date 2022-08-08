package com.example.test;

public class Test35 {
    public int searchInsert(int[] nums, int target) {
        int length=nums.length;
        int i=0;
        int j=length-1;
        while(i<=j&&i<length&&j<length)
        {
            int m=(i+j)/2;
            if(target>nums[m])i=m+1;
            if(target<nums[m])j=m-1;
            if(target==nums[m])return m;
        }
        return j+1;
    }
}
