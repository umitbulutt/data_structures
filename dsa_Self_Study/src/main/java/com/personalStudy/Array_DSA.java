package com.personalStudy;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Array_DSA {
    public static void main(String[] args) {

        // How to make implementation to array?
        System.out.println("--------------------------------------");
        int[]  numbers1 = {1,2,3,4,5};

        Arrays.stream(numbers1)
                .forEach(System.out::print);
        System.out.println();

        for (int i = 0; i < numbers1.length-1; i++) {

                numbers1[i] = numbers1[i+1];

        }
        numbers1 = Arrays.copyOf(numbers1,numbers1.length-1);

        Arrays.stream(numbers1)
                .forEach(System.out::print);

        System.out.println("--------------------------------------");

        int[] numbers = new int[3];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;

        System.out.println(Arrays.toString(numbers));
        












    }
}
