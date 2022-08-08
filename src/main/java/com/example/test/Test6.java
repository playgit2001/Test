package com.example.test;

public class Test6 {
    public String convert(String s, int numRows) {
        int length=s.length();
        if(numRows<=0)return "输入行数小于0";
        if(numRows==1)return s;
        StringBuilder a= new StringBuilder("");
        int tp=0;
        int cp;
        int tp1=0;
        for(int i=1;i<=numRows;i++)
            for( cp=0; cp<length ;cp=cp+2*(numRows-1)) {
                //System.out.println(cp+ i-1);
                if ((cp+ i-1)<s.length())
                a.append(s.charAt(cp+i-1));
                tp1=cp + 2 * numRows-i-1;
                if (tp1 < length && tp1%(numRows-1)!=0)
                    a.append(s.charAt(cp + 2 * numRows - i-1));
            }
        return a.toString();
    }
    /*public static void main(String[] args)
    {
        Test6 test6=new Test6();
        String a="abcasdaqew";
        System.out.println(test6.convert(a,3));
        //test6.convert(a,3);
    }*/
}
