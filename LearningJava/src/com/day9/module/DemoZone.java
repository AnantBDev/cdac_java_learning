package com.day9.module;

import java.time.*;
import java.util.Set;

public class DemoZone {
    public static void main(String[] args){
        Set<String> zones= ZoneId.getAvailableZoneIds();
        System.out.println(zones);

        LocalDateTime now=LocalDateTime.now();
        System.out.println(now);

        ZonedDateTime ist = now.atZone(ZoneId.of("Asia/Kolkata"));
        System.out.println(ist);

        now=ist.toLocalDateTime();
        System.out.println(now);

        ZonedDateTime nyc=now.atZone(ZoneId.of("America/New_York"));
        System.out.println(nyc);

        nyc=ist.toInstant().atZone(ZoneId.of("America/New_York"));
        System.out.println(nyc);

        LocalDateTime istlocal = ist.toLocalDateTime();
        LocalDateTime nyclocal = nyc.toLocalDateTime();

        Duration diff = Duration.between(nyclocal, istlocal);

        System.out.println(diff.toHoursPart()+" hrs, "+diff.toMinutesPart()+" mins");
    }
}
