package com.example.test;
import java.util.ArrayList;
import java.util.HashMap;

//解决方案一，把所有数组全部保存，一个一个判断，找到最大不连续字串（时间过多，已经爆炸）
//解决方案二，调整，从左往右，当遇到重复，计算长度，如果大则覆盖，然后把坐标停在重复字符第一次出现坐标的下一位，继续比较，如果到底了，再进行一次判断
//若是不重复，比较，然后直接退出，因为从当前位置到底部都不重复，那么剩下的不可能比这个长，然而这种方法还是凉了，绷不住了。
//通过解决方案二，我感觉能提高的唯一部分就是底层判断重复的方法的复杂度，没有hashmap的效率高，结果就是解决方案方案三，使用hashMap代替自己写的方法。



/*public class Test3 {
    public int lengthOfLongestSubstring(String s) {
        int length=s.length();
        if(length==1)
            return length;
        String s2;
        int maxnum=0;
        for(int i=0;i<length;i++)
        {
            for(int j=i;j<=length;j++)
            {
                s2=s.substring(i,j);
                if(repeat(s2)!=-1)
                {
                    if(s2.length()>maxnum)
                    {
                        maxnum=s2.length()-1;
                        i=i+repeat(s2)-1;
                        break;

                    }}
                if(j==length && i!=j && s2.length()!=-1 )
                    if(s2.length()>maxnum) {
                        maxnum = s2.length();
                        return maxnum;
                    }
            }

        }
        return maxnum;
    }
    public static int repeat(String str)
    {
        if(str==null||str.isEmpty())
            return -1;
        char[] str1=str.toCharArray();
        for(char str2:str1 )
            if(str.indexOf(str2)!=str.lastIndexOf(str2))
                return str.indexOf(str2)+1;
        return -1;
    }
    public static void main(String[] arg){
        String s1="au";
        Test3 test3=new Test3();
        System.out.println(test3.lengthOfLongestSubstring(s1));
    }

}*/
public class Test3 {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();//有HashMap作为存储结构
        int maxnum = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {//是否重复
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            maxnum = Math.max(maxnum, i - left + 1);
        }
        return maxnum;

    }
}