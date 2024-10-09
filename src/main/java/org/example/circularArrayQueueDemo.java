package org.example;

import Parte1.Ex2.CircularArrayQueue;

public class circularArrayQueueDemo {
    public static void main(String[] args){
        CircularArrayQueue<Integer> queue = new CircularArrayQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("to string: " + queue);
        System.out.println("Size: " + queue.size());
        System.out.println("Peek: " + queue.peek());
        queue.dequeue();
        System.out.println("to string after removal: " + queue);

        queue.enqueue(4);
        System.out.println("to string after add element 4: " + queue);
    }
}
