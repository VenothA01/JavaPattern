package com.dailycoder;

import java.util.Arrays;

public class Question9 {



    // run time complexity will be O(n)
    public static String stingReversal(String string){

        StringBuilder stringBuilder = new StringBuilder();
        int N = string.length()-1;

        for(int i=N;i>=0;--i){
            stringBuilder.append(string.charAt(i));
        }

        return stringBuilder.toString();
    }

    // run time complexity will be O(n/2)
    public static String stingReversal2(String string)
    {
        char[] charArray = string.toCharArray();
        int N = charArray.length;
        int half = N / 2;
        for (int i=0; i<half; i++)
        {
            char temp = charArray[i];
            charArray[i] = charArray[N-1-i];
            charArray[N-1-i] = temp;
        }
        return new String(charArray);
    }

    public static void main(String[] args) {

        System.out.println(stingReversal("ABCD"));
        System.out.println(stingReversal2("ABCD"));


    }
}
