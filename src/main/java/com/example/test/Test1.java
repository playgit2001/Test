package com.example.test;
// letcode1 给定一个整数数组 nums 和一个整数目标值 target，
// 请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
public class Test1 {
    public int[] twoSum(int[] nums, int target) {
        int[] num=new int[2];
        for(int i=0;i< nums.length+1;i++)
        {
            for(int j=i;j< nums.length;j++)
                if(nums[i]+nums[j]==target)
                {
                    num[0]=i;
                    num[1]=j;
                    return num;
                }
        }
        return num;
    }
//    public static void main(String[] args)
//    {
//        Test1 test1=new Test1();
//        int[] num={3,4,1,7,10};
//        int[] num1=test1.twoSum(num,5);
//        System.out.println(num1[0]+"\t"+num1[1]);
//    }
}
