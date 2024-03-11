package com.personalStudy.DataStructureTypes;

import java.sql.SQLOutput;
import     java.util.Stack;
public class Stack_DSA {
    public static void main(String[] args) {


        Stack<String> stringStack = new java.util.Stack<>();

        stringStack.push("Minecraft");
        stringStack.push("Skyrim");
        stringStack.push("Doom");
        stringStack.push("FFVII");


        // POP Method
        String myFavGame = stringStack.pop();
        System.out.println("myFavGame = " + myFavGame);

        // Peek Method - it retrieve the last eleemnt without deleting
        System.out.println(stringStack.peek());
        System.out.println(stringStack);

        // Search Method - it search the inserted element and returns teh result
        System.out.println(stringStack.search("FFVII"));


    }
}