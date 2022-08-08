package com.example.test;

public class Test14 {
    public String longestCommonPrefix(String[] strs) {

        int length=strs.length;
        int max=0;
        int realmax;
        if (length==0)return "";
        if(length==1)return strs[0];
        max = strs[0].length();

        for(int i=0;i<length;i++) {
            //System.out.println(strs[i].length());
            if (max > strs[i].length()) {
                max = strs[i].length();
            }
        }
        if(max==0)
            return "";
        StringBuilder tmp = new StringBuilder();
        for(int i=0;i<max;i++) {
            if (!equal(strs, i))
                break;
            tmp.append(strs[0].charAt(i));
        }
        return tmp.toString();
    }
    public static boolean equal(String[] strs,int index)
    {
        char a=strs[0].charAt(index);
        //boolean flag=true;
        for(int i=1;i<strs.length;i++)
            if(strs[i].charAt(index)!=a)
                return false;
        return true;
    }
    /*public static void main(String[] arg)
    {
        String[] s={"","b"};
        Test14 test14 = new Test14();
        System.out.println(test14.longestCommonPrefix(s));
    }*/
}
