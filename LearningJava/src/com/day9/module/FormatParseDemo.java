package com.day9.module;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatParseDemo {
    public static void main(String [] args){
        String mydate= "2026-04-08 12:20:30";

        //Parsing : String to date
        LocalDateTime dt=LocalDateTime
                .parse(mydate, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(dt);

        //Format: Date to String
        String date=dt.format(DateTimeFormatter.ofPattern("dd/MM/YY hh:mm:ss a"));
        System.out.println(date);

    }
}
