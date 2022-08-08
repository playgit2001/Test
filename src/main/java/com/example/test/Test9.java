package com.example.test;

public class Test9 {
    public boolean isPalindrome(int x) {
        String str=String.valueOf(x);
        System.out.println(str);
        if(str==null||str.isEmpty())
            return false;
        char[] str1=str.toCharArray();
        for(int i=0;i<=(str1.length-1)/2;i++)
            if (str1[i]!=str1[str1.length-1-i])
                return false;
        return true;
    }
}
