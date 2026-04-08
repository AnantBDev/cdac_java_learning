package com.day8.module;

import java.io.*;

import static java.lang.System.in;
/*This program is a demo program to understand the reading and writing
into and from a file using the buffer*/

public class DemoByteStreams {

    public static void writeFile(File f){
        //writing into a file using buffered stream
        try(BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(f))){
            String s = "This is using byte Stream";
            byte [] data = s.getBytes();
            out.write(data);
            out.flush();//flushing the buffer
        }catch(IOException e){
            System.out.println(e);
        }

    }
    public static void readFile(File f){
        //reading from a file using buffered stream
        try(BufferedInputStream out = new BufferedInputStream(new FileInputStream(f))){
            byte [] data=new byte[in.available()];
            while(in.read(data)!=-1){
                System.out.println(new String(data));
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    public static void main(String args [] ){
        File f = new File("two.txt");
        writeFile(f);
        readFile(f);

    }
}
