package com.personalStudy;

public class BigONatation {
    public static void main(String[] args) {
        int[] numbers = {0,1,2,3,4,5};
        System.out.println("-------------------------------");


        // O(1) - constant time
        System.out.println(numbers[0]);

        // O(2) - constant time - it doesnt matter the size
        System.out.println(numbers[0]);
        System.out.println(numbers[0]);

        System.out.println("-------------------------------");


        //O(n) - Linear(Dogrusal) Time
            //The size of the work is related to numbers of the input
        //O(n)
        System.out.println();                       // O(1)
        for (int i = 0; i < numbers.length; i++) {  // O(n)
            System.out.println(numbers[i]);
        }
        System.out.println();                       // O(1)

        //The total is O( 1 + n + 1 )  ->  O(2 + n)  -> O(n) - Because 2 work does not make big difference in 10000 code

        System.out.println("-------------------------------");

        //log O(n) - Logaritmic Time  ->Binary Search
            // O(n) + O(n)  ->   O( n+ n)  ->   O(2n)

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);             //O(n)
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);             //O(n)
        }

        System.out.println("-------------------------------");


        //O(n²)  - Quadratic Time - insertion sort , selection sort, bubble sort
        //                          ekstremely sort with large data set
        //          O(n²)
        //                                with this one makes O(n + n² ) -> O(2n²)
        //                                but if n =20 , 20 +400 = 420
        //                                20 is not big amount when you compare with 420, so we use O(n²)

        for (int i = 0; i < numbers.length; i++) {          //O(n)
            System.out.println(numbers[i]);
        }

        for (int i = 0; i < numbers.length; i++) {          // O(n)
            for (int j = 0; j < numbers.length; j++) {      // O(n)
                System.out.println(numbers[j ]);
            }
        }


        System.out.println("-------------------------------");

        //O(log n) - Logaritmic Time - binary(ikili) search
        //                             Binary searching works by comparing an input value to the middle element of the array.
        //                             The comparison determines whether the element equals the input, is less than the input,
        //                             or is greater than the input.


        System.out.println("-------------------------------");


        // O(2^n)  - Exponential Time - Opposite of the Logaritmic Grow
        //                              It becomes slow as the data grows









    }
}
