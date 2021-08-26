package com.dailycoder;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 7");
        try{
            int number = sc.nextInt();

            switch (number){

                case 1:
                    System.out.printf(DAY.SUNDAY.toString());
                    break;
                case 2:
                    System.out.printf(DAY.MONDAY.toString());
                    break;
                case 3:
                    System.out.printf(DAY.TUESDAY.toString());
                    break;
                case 4:
                    System.out.printf(DAY.WEDNESDAY.toString());
                    break;
                case 5:
                    System.out.printf(DAY.THURSDAY.toString());
                    break;
                case 6:
                    System.out.printf(DAY.FRIDAY.toString());
                    break;
                case 7:
                    System.out.printf(DAY.SATURDAY.toString());
                    break;
                default:
                    System.out.println("value should be from 1 to 7");
                    break;
            }
        }
        catch (InputMismatchException inputMismatchException){
            System.out.println("Value entered is not a valid number");
        }

    }
}
