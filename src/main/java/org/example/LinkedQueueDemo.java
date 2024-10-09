package org.example;

import Parte1.Ex1.LinkedQueue;

public class LinkedQueueDemo {
    public static void main(String[] args) {
        LinkedQueue<Integer> queue = new LinkedQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.print();
        System.out.println("Size: " + queue.size());
        System.out.println("Peek: " + queue.peek());

        queue.dequeue();
        queue.print();
        System.out.println("Size: " + queue.size());
    }
}
