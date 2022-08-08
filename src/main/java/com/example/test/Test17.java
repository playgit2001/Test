package com.example.test;

import java.util.ArrayList;
import java.util.List;

public class Test17 {
    List<Character> arr =new ArrayList<Character>();

    List<String> list=new ArrayList<String>();
    String[] letterMap ={
            "", // 0
            "", // 1
            "abc", // 2
            "def", // 3
            "ghi", // 4
            "jkl", // 5
            "mno", // 6
            "pqrs", // 7
            "tuv", // 8
            "wxyz", // 9
    };
    public List<String> letterCombinations(String digits) {

        int length=digits.length();
        if(length==0) return list;
        backtracking(digits);
        return list;
    }
    private void backtracking(String digits)
    {
        if(arr.size()==digits.length()) {
            StringBuilder str = new StringBuilder();
            for (Character character : arr) {
                str.append(character);
            }
            list.add(str.toString());
            return;
        }
        int index=Character.getNumericValue(digits.charAt(arr.size()));
        String letter=letterMap[index];
        System.out.println(letter+" "+index);
        for(int i=0;i<letter.length();i++)
        {
            arr.add(letter.charAt(i));
            backtracking(digits);
            arr.remove(arr.size()-1);

        }
    }
 /*   public static void main(String[] arg)
    {

        Test17 test17 = new Test17();
        String s="23";
        System.out.println(test17.letterCombinations(s));

    }*/
}
