package com.example.test;

public class Test27 {
    public int removeElement(int[] nums, int val) {
        int length=nums.length;
        if(length==0)return 0;
        if(length==1&&nums[0]==val) return 0;
        else if(length==1&&nums[0]!=val)return 1;
        int i=0,j=0;
        while(i<length&&j<length)
        {
            while(j<length&&nums[j]==val)//空指针
            {j++;
            }
            if(j==length)break;
            nums[i]=nums[j];
            i++;
            j++;
        }
        return i;
    }
}
