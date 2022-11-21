package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1,2,3,-1,-2,8);

        long negnums = nums.stream().filter((i)-> i<0).count();


        nums.stream().filter(e -> e<0).map((e) -> e*(-1)).forEach(e -> System.out.println(e));

        nums.stream().map((e) -> {
            return e<0 ? e*-1: e;
        }).forEach(e -> System.out.println(e));

        System.out.println("Number of negative number: "+ negnums);
    }
}