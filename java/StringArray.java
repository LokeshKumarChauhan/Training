package com.sapient.day5;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StringArray {
    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();
        list.add("Sunday");
        list.add("Monday");
        list.add("Tuesday");
        list.add("Wednesday");
        list.add("Thursday");
        list.add("Friday");
        list.add("Saturday");

        Stream<String> stream = list.stream().filter(Predicate.not(element -> element.contains("Friday")));
        stream.forEach(System.out::println);
//        stream.foreach(k->System.out.pprntln(k));
//        for (String string : list) {
//            if (string.contains("Friday")) {
//                System.out.println(" Found");
//            }
//        }
        stream = Stream.of("1","2","3");

        System.out.println("Stream Array " + stream);
    }
}