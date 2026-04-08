package com.day9.module;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DemoLocalTime {
    public static void main(String[] args){
        LocalTime now= LocalTime.now();
        System.out.println(now);
        LocalTime later= LocalTime.of(12,30,30);

        Duration interval= Duration.between(now, later);
        System.out.println(interval.toHoursPart()+" hrs "+interval.toMinutesPart()+" mins ");

        LocalTime t1=now.plusHours(2);
        System.out.println(t1);

        LocalTime t2=now.minusMinutes(30);
        System.out.println(t2);

        System.out.println(" Current Time ");
        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());

        LocalDateTime dt=now.atDate(LocalDate.now());
        System.out.println(dt);

        LocalTime tea_break = LocalTime.of(10,00,00);
        Duration break_interval = Duration.between(now,tea_break);
        System.out.println(Duration.between(tea_break,now));
        System.out.println(break_interval.toHoursPart()+":"+break_interval.toMinutesPart());
    }
}
