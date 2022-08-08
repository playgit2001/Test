package com.example.test;

public class Test7 {
    public int reverse(int x) {
        int sum=0;
        boolean flag=true;
        if(x==0)return 0;
        if(x==-2147483648) return 0;
        if(x<0)
        {flag=false;
            x=x*(-1);}
        int n;
        n=x%10;
        System.out.println(flag);
        int t=(int)Math.pow(2,31);
        int t1=t/10;
        int t2=t%10;
        while(n==0){
            x=x/10;
            n=x%10;
        }
        while(x!=0)
        {

            if(sum>t1 )return 0;
            else if (sum==t1&&(n>7||n>8)) return 0;
            sum=sum*10+n;
            x=x/10;
            n=x%10;
            System.out.println(sum+" "+x+"  "+n);
        }
        if(!flag)sum=-sum;
        return sum;
    }
    /*public static void main(String[] arg)
    {
        int x=-2147483412;
        Test7 test7 = new Test7();
        System.out.println(test7.reverse(x));
    }*/

}
