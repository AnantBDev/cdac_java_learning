package com.day8.module;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class LocalDateDemo {

    public static void main(){
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate christmas=LocalDate.of(2026,12,26);
        System.out.println(christmas);

        Period timeleft=today.until(christmas);
        System.out.println("Time Left: "+ timeleft.getMonths() + " months "+timeleft.getDays()+" days ");

        System.out.println(today.getDayOfMonth());
        System.out.println(today.getDayOfWeek());
        System.out.println(today.getDayOfYear());

        System.out.println(today.getMonthValue());
        System.out.println(today.getMonth());

        System.out.println(today.getYear());

        LocalDate tommorrow = today.plus(1, ChronoUnit.DAYS);
        System.out.println(tommorrow);

        System.out.println(today.plusMonths(1));
        System.out.println(today.plusYears(1));
        System.out.println(today.plusWeeks(1));

        Stream<LocalDate> fullyear=LocalDate.of(2026, 1,1).datesUntil(LocalDate.of(2027,1,1));

        Predicate<LocalDate> fridays=(d)-> d.getDayOfWeek().equals(DayOfWeek.FRIDAY);
        Predicate<LocalDate> the13th=(d)-> d.getDayOfMonth()==13;

        fullyear.filter(the13th).filter(fridays).forEach(System.out::println);
        System.out.println("------------------");
        System.out.println(today.with(TemporalAdjusters.firstDayOfNextMonth()));

        System.out.println(today.with(TemporalAdjusters.nextOrSame(DayOfWeek.TUESDAY)));
        System.out.println(today.with(TemporalAdjusters.previous(DayOfWeek.SUNDAY)));
        System.out.println(today.with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY)));

        System.out.println(today.with(TemporalAdjusters.dayOfWeekInMonth(2,DayOfWeek.SUNDAY)));

    }
}
