package com.dailycoder;

import java.util.Stack;

public class Question11 {

    private static boolean isBalanced(String string) {

        Stack<Character> stack  = new Stack<Character>();
        for(int i = 0; i < string.length(); i++) {
            char current = string.charAt(i);
            if(current == '[' || current == '<' || current == '(' ) {
                stack.push(current);
            } else if(current == ']') {
                if(stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            } else if(current == ')') {
                if(stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            } else if(current == '>') {
                if(stack.isEmpty() || stack.pop() != '<') {
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }



    public static void main(String[] args) {

        System.out.println(isBalanced("[<()>[](<>)]"));
        System.out.println(isBalanced("(<<>)"));
        System.out.println(isBalanced("(<<>)"));
        System.out.println(isBalanced("(<<>)"));
        System.out.println(isBalanced("[<()>[](<>)]"));

    }
}
