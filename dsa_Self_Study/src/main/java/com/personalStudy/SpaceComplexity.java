package com.personalStudy;

public class SpaceComplexity {
    public static void main(String[] args) {

        String[] names = {"Umit","Tataev","Ayse","Atacan"};

        // Time Complexity
        // O(n) space
        //          When we talk about memory allogation of the space complexity, we are looking for only
        //                  additional space allogation related to main subject. If below copy array wouldn`t be,
        //                  our space complexity would be O(1).

        String[] copy = new String[names.length];

        for (int i = 0; i < names.length; i++) {
            System.out.println("Hi " + names[i]);
        }
















    }
}
