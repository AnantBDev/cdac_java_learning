package com.day01.practice.assignment01.q05;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class tweeterImpl {
public static void main(String[] args){
    List<tweeter> twlst=new ArrayList<tweeter>();
    initialisedata(twlst);
    Stream<tweeter> stream=twlst.stream();

    System.out.println("");
    System.out.println("===============================================");
    System.out.println("List all tweets posted in current year");
    Predicate<tweeter> byyear=(tw)-> tw.getYearofpost()==2026;
    stream.filter(byyear).forEach(System.out::println);

    stream=twlst.stream();
    System.out.println("");
    System.out.println("===============================================");
    System.out.println("List all tweets for a particular hashtag");
    Predicate<tweeter> byhashtag=(tw)->tw.getHastags().contains("#HotClimate");
    stream.filter(byhashtag).forEach(System.out::println);

    stream=twlst.stream();
    System.out.println("");
    System.out.println("===============================================");
    System.out.println("Count the tweets by subject");
    Map<String, Long> bysubject=stream.collect(Collectors.groupingBy(tweeter::getSubject, Collectors.counting()));
    bysubject.forEach((k,v)-> System.out.println("Subject "+k+" : "+v));

    stream=twlst.stream();
    System.out.println("");
    System.out.println("===============================================");
    System.out.println("List the tweets that got more than 10000 tweets");
    Predicate<tweeter> bynoofviews=(tw)->tw.getNoofviews()>10000;
    stream.filter(bynoofviews).forEach(System.out::println);


    stream=twlst.stream();
    System.out.println("");
    System.out.println("===============================================");
    System.out.println("Print top 5 trending tweets");
    Comparator<tweeter> bynoofviewsComparator = Comparator.comparing(tweeter::getNoofviews, Comparator.reverseOrder());
    stream.sorted(bynoofviewsComparator).limit(5).forEach(System.out::println);

}

    private static void initialisedata(List<tweeter> twlst) {
    twlst.add(new tweeter("Dhurandhar",2026,2000, Set.of("#Movie","#Dhurandhar")));
    twlst.add(new tweeter("Weather",2025,200, Set.of("#PuneRains","#Weather")));
    twlst.add(new tweeter("HotClimate",2025,1000, Set.of("#Rajasthan","#HotClimate")));
    twlst.add(new tweeter("Water",2026,1500, Set.of("#WaterShortage","#HotClimate")));
    twlst.add(new tweeter("CDAC",2024,100, Set.of("#CDAC","#BigData")));
    twlst.add(new tweeter("NarendraModi",2019,20000, Set.of("#PMModi","#GOI")));
    }
}
