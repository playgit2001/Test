package com.example.test;

public class Test69 {
    public int mySqrt(int x) {
        if(x==0)return 0;
        if(x==1)return 1;
        int left=0;
        int right=x/2;
        while(left<=right) {
            int mid = left + ((right - left) / 2);
            long mid1=mid;
            mid1=mid1*mid1;
            if(mid1<x)left=mid+1;
            else if (mid1>x) {
                right=mid-1;
            }
            else return mid;
        }
        return right;
    }
}
