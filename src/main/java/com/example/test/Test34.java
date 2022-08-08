package com.example.test;

public class Test34 {
    public int[] searchRange(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        boolean flag=false;
        int mid=0;
        while(left<=right) {
            mid = left + ((right - left) / 2);// 防止溢出 等同于(left + right)/2
            if(nums[mid]<target)left=mid+1;
            else if (nums[mid]>target) {
                right=mid-1;
            }
            else {
                flag=true;
                break;
            }
        }
        int[] res=new int[2];
        if(flag==true)
        {
            int right1=mid;
            int left1=mid;
            while(right1+1<nums.length&&nums[right1+1]==target)
                right1++;
            while(left1-1>=0&&nums[left1-1]==target)
                left1--;
            res[0]=left1;
            res[1]=right1;
            return res;
        }
        return new int[]{-1,-1};
    }
}
