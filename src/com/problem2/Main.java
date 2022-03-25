package com.problem2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Bhopal");
        cities.add("Patna");
        cities.add("Indore");
        cities.add("Bihar");
        cities.add("Durg");
        cities.add("Jabalpur");

        cities = cities.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(cities);
    }
}
