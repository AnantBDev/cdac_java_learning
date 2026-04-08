package com.day6.module;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DemoIntStream {

    public static void main(String[] args){
        int[] arr={23,10,7,13,18,26,21,4,24,15,2,17,7,13,18,26,21,4,45};
        IntStream stream= Arrays.stream(arr);

        long count=stream.distinct().count();
        System.out.println(count);

        stream=Arrays.stream(arr);

        stream.distinct().sorted().limit(10).forEach(System.out::println);
        stream=Arrays.stream(arr);
        Set<Integer> primes = stream.filter(lambdaDemo::isPrime).boxed()
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(primes);

        stream=Arrays.stream(arr);
        Set<Integer> squares = stream.map((n) -> n*n).boxed().collect(Collectors.toCollection(TreeSet::new));

        System.out.println(squares);

        stream=Arrays.stream(arr);
        stream.sorted().dropWhile((n)->n<20).forEach(System.out::println);

        stream=Arrays.stream(arr);
        long total=stream.reduce(0,(n1,n2) -> n1+n2);
        System.out.println(total);

        stream=Arrays.stream(arr);
        OptionalInt min=stream.min();
        if(min.isPresent())
            System.out.println(min.getAsInt());

        stream=Arrays.stream(arr);
        OptionalInt max=stream.max();
        if(max.isPresent())
            System.out.println(max.getAsInt());

//        stream=Arrays.stream(arr);
//        OptionalInt max = stream.max();
//        if(max.isPresent())
//            System.out.println(max.getAsInt());
        stream=Arrays.stream(arr);
        OptionalDouble ave=stream.average();
        if(ave.isPresent())
            System.out.println(ave.getAsDouble());
    }
}
