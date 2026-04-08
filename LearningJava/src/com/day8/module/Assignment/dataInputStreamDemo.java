package com.day8.module.Assignment;

import java.io.*;
import java.util.List;
import java.util.stream.Stream;

import static java.lang.System.in;

public class dataInputStreamDemo {

    public static void WriteStream(File f){
        try ( DataOutputStream dout =
                      new DataOutputStream(new FileOutputStream(f)) ) {

            dout.writeDouble(1.1);
            dout.writeInt(55);
            dout.writeBoolean(true);
            dout.writeChar('4');
        }

        // Catch block to handle the exceptions
        catch (IOException ex) {

            // Display message when FileNotFoundException occurs
            System.out.println(ex);
        }


    }

    public static void ReadStream(File f){
        try ( DataInputStream din = new DataInputStream(new FileInputStream(f)) ) {
            // Illustrating readDouble() method
            double a = din.readDouble();

            // Illustrating readInt() method
            int b = din.readInt();

            // Illustrating readBoolean() method
            boolean c = din.readBoolean();

            // Illustrating readChar() method
            char d = din.readChar();

            // Print the values
            System.out.println("Values: " + a + " " + b + " " + c + " " + d);

        }

        // Catch block to handle the exceptions
        catch (IOException e) {

            // Display message when FileNotFoundException occurs
            System.out.println("Cannot Open the Input File");
            return;
        }
    }
    public static void main(String [] args){
        File f = new File("datastreamsample.txt");
        WriteStream(f);
        ReadStream(f);
    }
}
