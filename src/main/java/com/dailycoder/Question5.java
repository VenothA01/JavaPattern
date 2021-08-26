package com.dailycoder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Question5 {

    static int MAX_BYTES;

    private static void copyBinaries(String sourcePath,String destinationPath) throws IOException {

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(sourcePath);
            fileOutputStream = new FileOutputStream(destinationPath);

            byte[] byteArr = new byte[MAX_BYTES];
            int numberOfBytes = 0;

            System.out.println("copying binaries");

            while( (numberOfBytes = fileInputStream.read(byteArr)) != -1 )
            {
                fileOutputStream.write(byteArr, 0, numberOfBytes);
            }

            System.out.println("Binaries copied");

        }
        catch (FileNotFoundException fileNotFoundException){
            System.out.println("FileNotFoundException");
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        finally {
            if(fileInputStream!=null){
                fileInputStream.close();
            }
            if(fileOutputStream!=null){
                fileOutputStream.close();
            }
        }
    }

    public static void main(String[] args) throws IOException {

        String sourcePath = "src\\main\\resources\\soruce.dat";
        String destinationPath = "src\\main\\resources\\destination.dat";

        copyBinaries(sourcePath,destinationPath);
    }
}
