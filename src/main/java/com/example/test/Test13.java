package com.example.test;

public class Test13 {
    public int romanToInt(String s) {
        int length=s.length();
        int i=0;
        int sum=0;
        int t;
        while(i<length)
        {
            t=length-i-1;
            switch (s.charAt(t)){
                case 'I':{
                    sum+=1;
                    break;
                }
                case 'V':{
                    if(t-1!=-1) {
                        if (s.charAt(t-1) == 'I') {sum += 4;i++;break;}

                    }
                    sum+=5;
                    break;
                }
                case 'X':{
                        if(t-1!=-1) {
                            if (s.charAt(t-1) == 'I') {sum += 9;i++;break;}}
                    sum+=10;
                    break;
                }
                case 'L':{
                    if(t-1!=-1) {
                        if (s.charAt(t - 1) == 'X') {
                            sum += 40;
                            i++;
                            break;
                        }
                    }
                    sum+=50;
                    break;
                }
                case 'C':{
                    if( t-1!=-1) {
                            if (s.charAt(t-1) == 'X') {sum += 90;i++;break;}
                    }
                    sum+=100;
                    break;
                }
                case 'D':{
                    if( t-1!=-1) {
                        if (s.charAt(t-1) == 'C') {sum += 400;i++;break;}
                    }

                    sum+=500;
                    break;
                }
                case 'M':{
                    if( t-1!=-1) {
                        if (s.charAt(t-1) == 'C') {sum += 900;i++;break;}
                    }
                    sum+=1000;
                    break;
                }

            }
            i++;
            System.out.println(sum);
        }
        return sum;
    }
    /*public static void main(String[] arg)
    {
        String s="MCMXCIV";
        Test13 test13 = new Test13();
        System.out.println(test13.romanToInt(s));
    }*/
}
