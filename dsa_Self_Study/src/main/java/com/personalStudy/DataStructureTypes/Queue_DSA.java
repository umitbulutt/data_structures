package com.personalStudy.DataStructureTypes;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_DSA {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<String>();

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println(queue);


        //Poll Method -> it removes the first element one by one
        queue.poll();

        //IsEmpty Method -> it check is the queue is empty or not?
        System.out.println(queue.isEmpty());

        //Peek Method -> it retrieves the first element without removing
        queue.peek();












    }
}
