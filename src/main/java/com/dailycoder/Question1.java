package com.dailycoder;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.ClientInfoStatus;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Question1 extends Thread {

    private static int totalWordCount;
    List<String> list = new LinkedList<>();
    private static String path = "src\\main\\resources\\Sample.txt";


    public void run(){
        try{
            System.out.println("inside run");
            if(!Files.exists(Paths.get(path))){
                throw new IOException(path+" not found");
            }
            BufferedReader bufferedReader = Files.newBufferedReader(Paths.get(path));
            list = bufferedReader.lines().collect(Collectors.toList());

        }
        catch (IOException ioException){
            System.out.println("IOException "+ioException.getMessage());
        }
    }
    public static void main(String[] args) throws InterruptedException {

        Question1 question1 = new Question1();
        question1.start(); // Read data from the flat file in seperate thread

        question1.join(); //wait until thread1 complete its execution

        question1.list.forEach(x ->{
            totalWordCount += x.length();
        });

        System.out.printf("total count present in the file [%s] is %d",path,totalWordCount);
    }
}
