package com.day8.module;

import java.io.File;
import java.io.IOException;

public class DemoFile {
    //Explore mkdir
    public static void main(String [] args){
        //Tries to reference file one.txt
        File f = new File("one.txt");

        if(f.exists())
            //If file is available then it will print file exists
            System.out.println("File Available");
        else{
            //If the file does not exist then it will create the file
            //try catch block is added for safety.
            try{//file gets created here in the specified name
                f.createNewFile();
            }
            catch(IOException e){
                //Any exceptions while creating the file will be captured
                System.out.println(e);
            }
        }
        //different methods which can be used for handling files
        System.out.println("Name : "+f.getName());//gets the name of the file
        System.out.println("Path : "+f.getAbsolutePath());//gets the absolute path of the file
        System.out.println("Length : "+f.length());//gets the length of the file data
        System.out.println("Read : "+f.canRead());//checks if the file is readable
        System.out.println("Write : "+f.canWrite());//checks if the file is writable
        System.out.println("Execute : "+f.canExecute());//checks if the file is executable
        System.out.println("Is File : "+f.isFile());//checks if the provided input is a file
        System.out.println("Is Directory : "+f.isDirectory());//checks if the given input is a directory

    }


}
