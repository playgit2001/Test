package com.example.test;

public class Test26 {
    public int removeDuplicates(int[] nums) {
        int length=nums.length;
        if(length==0)return 0;
        if(length==1)return nums[0];
        int i=0,j=0;
        while(i<length&&j<length)
        {
            while(j+1<length&&nums[j]==nums[j+1])//空指针
            {j++;
            }
            nums[i]=nums[j];
            i++;
            j++;
        }
        return i;
    }
}
