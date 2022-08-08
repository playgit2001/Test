package com.example.test;

public class Test278 {
    public int firstBadVersion(int n) {
        int right=n;
        int left=1;
        while(left<right)
        {
            int mid=left+(right-left)/2;
            if (isBadVersion(mid)) {
                right = mid; // 答案在区间 [left, mid] 中
            } else {
                left = mid + 1; // 答案在区间 [mid+1, right] 中
            }

        }
        return left;
    }
}
