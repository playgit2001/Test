package com.example.test;

import java.util.Stack;

public class Test20 {
    public boolean isValid(String s) {
        int length=s.length();
        if(length%2==1)return false;
        if(length==0)return true;
        Stack<Character> st=new Stack<Character>();
        int i=0;
        while(i<length)
        {
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{')st.push(s.charAt(i));
            if (s.charAt(i)==')')
            {
                if(st.empty()||st.peek()!='(')return false;
                else st.pop();

            }
            if (s.charAt(i)=='}')
            {
                if(st.empty()||st.peek()!='{')return false;
                else st.pop();

            }
            if (s.charAt(i)==']')
            {
                if(st.empty()||st.peek()!='[')return false;
                else st.pop();

            }
            i++;
        }
        if(!st.empty())return false;
        return true;
    }
}
