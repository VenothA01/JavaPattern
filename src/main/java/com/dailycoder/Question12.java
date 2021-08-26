package com.dailycoder;

import java.util.HashMap;
import java.util.Map;

public class Question12 {

    private static Map<Character,Integer> countCharacters(String str){

        char[] characterArray = str.toCharArray();
        Map<Character,Integer> map = new HashMap<>();

        for(char c: characterArray){

            if(!map.containsKey(c)){
                map.put(c,1);
            }
            else{
                map.put(c,map.get(c)+1);
            }
        }

        return map;
    }

    public static void main(String[] args) {

        System.out.println(countCharacters("MADAM"));
    }
}
