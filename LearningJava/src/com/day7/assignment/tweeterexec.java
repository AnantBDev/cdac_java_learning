package com.day7.assignment;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class tweeterexec {

    public static void main(String[] args) {
        List<tweeter> lst = initializeData();
        Stream<tweeter> stream = lst.stream();

        System.out.println("");
        System.out.println("-----List all Tweets that are posted in current year------");
        Predicate<tweeter> byyear = ((tw) -> tw.getYearofpost() == 2026);
        stream.filter(byyear).forEach(System.out::println);

        System.out.println("");
        System.out.println("----------List all the tweets for a particular hastag---------");
        stream = lst.stream();
        Predicate<tweeter> byhastag = ((tw) -> tw.getHashtags().contains("#punerains"));
        stream.filter(byyear).forEach(System.out::println);

        System.out.println("");
        System.out.println("-----Count the tweets by subject----------");
        stream = lst.stream();
        Map<String, Long> bysubject = stream.collect(Collectors.groupingBy(tweeter::getSubject, Collectors.counting()));
        bysubject.forEach((k, v) -> System.out.println("Subject" + k + " : " + v));


        System.out.println("");
        System.out.println("--------List the tweets that got more than 10000 views------------");
        stream = lst.stream();
        Predicate<tweeter> bynoofviews = ((tw) -> tw.getNoofviews() > 10000);
        stream.filter(bynoofviews).forEach(System.out::println);

        System.out.println("");
        System.out.println("-------Print top 5 trending tweets---------");
        stream = lst.stream();
        Comparator<tweeter> bynoofviewsComparator = Comparator.comparing(tweeter::getNoofviews, Comparator.reverseOrder());
        stream.sorted(bynoofviewsComparator).limit(5).forEach(System.out::println);

    }

    public static List<tweeter> initializeData(){
        List<tweeter> tweet=new ArrayList<tweeter>();

        tweet.add(new tweeter("India",2004,40, Set.of("#great","#beautiful")));
        tweet.add(new tweeter("Floods",2026,70000, Set.of("#punerains","#flood")));
        tweet.add(new tweeter("weather",2026,800, Set.of("#punerains","weatherupdate")));
        tweet.add(new tweeter("cdac",2020,900, Set.of("Big data","training")));
        tweet.add(new tweeter("IPL",2024,300, Set.of("BCCI","ICC")));
        tweet.add(new tweeter("Virat",2025, 400,Set.of("Cricket","London")));
        return tweet;
    }

}

