package com.example.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test18 {
    class Solution {
        public List<List<Integer>> fourSum(int[] nums, int target) {
            int length=nums.length;
            List<List<Integer>> list=new ArrayList<>();
            if(length<4)return list;
            Arrays.sort(nums);
            for(int i=0;i<length;++i)
            {
                if(i > 0 && nums[i] == nums[i - 1]) continue;
                for(int j=i+1;j<length;++j)
                {
                    if(j>i+1 && nums[j]==nums[j-1] )continue;
                    int L=j+1;
                    int R=length-1;
                    while(L<R){
                        long tmp=(long)nums[i];
                        tmp+=nums[j];
                        tmp+=nums[L];
                        tmp+=nums[R];
                        if(tmp==target)
                        {
                            list.add(Arrays.asList(nums[i],nums[j],nums[L],nums[R]));
                            while(L<R &&nums[L]==nums[L+1])
                                ++L;
                            while(L<R &&nums[R]==nums[R-1])
                                --R;
                            ++L;
                            --R;
                        }
                        if(tmp<target)++L;
                        if(tmp>target)--R;
                    }
                }

            }
            return list;
        }
    }
}
