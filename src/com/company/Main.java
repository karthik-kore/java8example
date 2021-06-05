package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<person> list= Arrays.asList(
                new person(3,"kore","tcs"),
                new person(2,"karthik","infosys"),
                new person(1,"kajal","google")
        );
        //print list of objects
        System.out.println(list);
        //sorted
        Collections.sort(list,(p1,p2)->p1.getName().compareTo(p2.getName()));
        System.out.println(list);
        //company end with "s"
        List<Object> li=list.stream().filter(person -> person.getCompany().endsWith("s")).collect(Collectors.toList());
        System.out.println(li);

    }
}
