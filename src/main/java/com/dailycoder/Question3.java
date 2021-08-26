package com.dailycoder;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question3 {

    static int MAX_MULTIPLIER=10;

    private static void printMultiplicationTable(int number){

        int i;
        for(i=1;i<=MAX_MULTIPLIER;++i){
            System.out.printf("%d * %d = %d",number,i,(number*i));
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print Table");
        try{
            int number = sc.nextInt();
            if(number!=0){
                printMultiplicationTable(number);
            }
        }
        catch (InputMismatchException inputMismatchException){
            System.out.println("Value entered is not a valid number");
        }
    }

}
