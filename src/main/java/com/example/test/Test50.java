package com.example.test;

//实现 pow(x, n) ，即计算 x 的整数 n 次幂函数（即，xn ）。
//蛮力法解决，通过递归的方法，解决方式是多次的乘n和除n。
public class Test50 {
    public double myPow(double x, int n) {
        if(n==0)//不以1为基准，而是以0为基准，作为结束递归中的递的标识符。
            return 1;
        double res=1.0;
        for(int i=n;i!=0;i/=2)
        {
            if (i%2!=0)
                res*=x;
            x*=x;
        }
        return n<0? 1/res:res;
    }
}
