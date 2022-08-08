package com.example.test;

public class Test704 {
    //二分查找，区间为[a,b],所以使用left<=right， 同时当num[mid]小于目标值，right=mid-1；
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<=right) {
            int mid = left + ((right - left) / 2);
            if(nums[mid]<target)left=mid+1;
            else if (nums[mid]>target) {
                right=mid-1;
            }
            else return mid;
        }
        return -1;
    }
}
