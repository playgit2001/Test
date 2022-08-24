public class Test5 {
    public String replaceSpace(String s) {
        StringBuilder s1=new StringBuilder();
        int length=s.length();
        for(int i=0;i<length;i++)
        {
            if(s.charAt(i)!=' ')
                s1.append(s.charAt(i));
            else
                s1.append("%20");
        }
        return s1.toString();
    }
}
