package com.day7.module;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.StableValue.map;

public class DemoIntegerStream {
    public static void main(String [] args){
        List<Integer> lst = List.of(23,10,7,13,18,26,21,4,24,15,2,17,7,13);
        Stream<Integer> stream = lst.stream();
        List<Integer> mapped=stream.distinct().sorted().map(n->n*10).collect(Collectors.toList());
        System.out.println(mapped);

        stream=lst.stream();
        List<Integer> filtered = stream.filter((n)->n%5==0).collect(Collectors.toList());
        System.out.println(filtered);

        stream=lst.stream();
        //Any Match returns true if atleast one element matches the given condition.
        boolean result=stream.anyMatch((n) ->n>10);
        System.out.println(result);

        stream=lst.stream();
        //allMatch returns true if every element in the stream matches the given condition.
        result=stream.allMatch((n) -> n>10);
        System.out.println(result);

        stream=lst.stream();
        Optional<Integer> first=stream.findFirst();
        //Option1
        first.ifPresent(System.out::println);
        //Option2
        first.ifPresentOrElse((n) -> System.out.println(n),
                ()-> System.out.println("No data"));
        //Option3
        if(first.isPresent())
            System.out.println(first.get());
        else
            System.out.println("No data");

        stream=lst.stream();
        Optional<Integer> min=stream.min(Integer::compareTo);
        min.ifPresent(System.out::println);

        stream=lst.stream();
        Optional<Integer> max=stream.max(Integer::compareTo);
        max.ifPresent(System.out::println);

        stream=lst.stream();
        OptionalDouble ave=stream.mapToDouble(Double::valueOf).average();
        ave.ifPresent(System.out::println);

        List<List<Integer>> nested= List.of(List.of(1,2), List.of(2,3), List.of(3,4));

        Stream<List<Integer>> nstream=nested.stream();
        System.out.println(nstream.distinct().count());

        nstream=nested.stream();
        System.out.println(nstream.flatMap((l)-> l.stream())
                .distinct().count());

    }
}
