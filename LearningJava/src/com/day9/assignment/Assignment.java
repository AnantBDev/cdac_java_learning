package com.day9.assignment;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Assignment {

    public static void main(String[] args){

        //1. Calculate your age in no of days, months, years
        LocalDate now=LocalDate.now();
        LocalDate dob=LocalDate.of(2000,3,12);
        //Period to get diff between two dates
        Period age= dob.until(now);
        System.out.println("Days: "+age.getDays()+" Months: "+age.getMonths()+" Years: "+age.getYears());

        //2. Compute programmers day without using plusDays
        LocalDate programmersday=LocalDate.ofYearDay(2026,256);
        Period toProgrammersDay=now.until(programmersday);
        LocalDate progdayfromtoday= now.plus(toProgrammersDay);
        System.out.println("Programmers day: "+progdayfromtoday);

        //3. Find out all the months that start on a sundays in year 2025
        LocalDate d=LocalDate.of(2025,1,1);
//        System.out.println(d);
//        System.out.println(d.getDayOfWeek());
//        System.out.println(d.getDayOfMonth());
//        System.out.println(d.with(TemporalAdjusters.firstDayOfNextMonth()).getDayOfWeek());
//        d=d.plusMonths(1);
        System.out.println("----------Months ------------");
        Stream<LocalDate> fullyear=LocalDate.of(2025,1,1).datesUntil(LocalDate.of(2026,1,1));
        Predicate<LocalDate> pre=(f)->(f.getDayOfMonth()==1 && f.getDayOfWeek().equals(DayOfWeek.SUNDAY));
        fullyear.filter(pre).forEach(System.out::println);
//        List<Month> lst=new ArrayList<Month>();
//        System.out.print("Days having 1st day as Sunday in 2025: ");
//        while (d.getYear()<2026){
//            if(d.getDayOfWeek()== DayOfWeek.SUNDAY){
//                lst.add(d.getMonth());
//            }
//            d=d.plusMonths(1);
//        }
//        System.out.println(lst);

        //4. If we leave Mumbai at 2:05 AM and arrive in New York at 8:40 AM. How long is the flight?
        LocalDateTime departtime=LocalDateTime.of(2026,04,8,2,5);
        ZonedDateTime departtimez=departtime.atZone(ZoneId.of("Asia/Kolkata"));
        System.out.println(departtimez);

        LocalDateTime arrivaltime=LocalDateTime.of(2026,04,8,8,40);
        ZonedDateTime arrivaltimez=arrivaltime.atZone(ZoneId.of("America/New_York"));
        System.out.println(arrivaltimez);

        Duration diff=Duration.between(departtimez,arrivaltimez);
        System.out.println(diff.toHoursPart()+" Hours"+ diff.toMinutesPart()+" minutes");
//        System.out.println(nownew);
//        LocalDateTime departtime=LocalDateTime;
//        String time="02:05";
//        LocalDateTime departtime=LocalDateTime.parse(time, DateTimeFormatter.ofPattern("HH:mm"));
//        System.out.println(departtime);

    }
}
