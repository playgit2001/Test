package com.example.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test15 {
    public List<List<Integer>> threeSum(int[] nums) {
        int length=nums.length;
        List<List<Integer>> list = new ArrayList<>();
        if(length<3) return list;
        Arrays.sort(nums);
        for(int L=0;L<length;++L)
        {
            if(nums[L] > 0) return list;
            if(L > 0 && nums[L] == nums[L - 1]) continue;
            int i=L+1;
            int j=length-1;
            while(i<j)
            {
                int curr = nums[L];
                int tmp=curr+nums[i]+nums[j];
                if (tmp == 0) {
                    list.add(Arrays.asList(curr,nums[i],nums[j]));
                    while(i<j && nums[i]==nums[i+1])
                        ++i;
                    while(i<j && nums[j]==nums[j-1])
                        --j;
                    ++i;
                    --j;
                }
                if(tmp<0)++i;
                if(tmp>0)--j;
            }
        }
        return list;
    }
    /*public static void main(String[] arg)
    {

                List<Integer> b=new ArrayList<Integer>();
                for(int j=0;j<=5;j++)
                {
                    b.add(j);
                }

            System.out.println(b);

    }*/
    }

