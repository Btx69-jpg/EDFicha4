package Parte1.Ex2;

import java.util.Arrays;

public class CircularArrayQueue <T>{
    /**
     * circular array queue
     * */
    private T[] array;

    /**
     * the index of the head in the queue array
     * */
    private int head;

    /**
     * the index of the tail in the queue array
     * */
    private int tail;

    /**
     * the number of elements in the queue
     * */
    private int size;

    private static final int DEFAULT_CAPACITY = 9;

    public CircularArrayQueue(){
        this.array = (T[]) new Object[DEFAULT_CAPACITY];
        this.head = 0;
        this.tail = -1;
    }

    /**
     * if the queue is full , add more space
     * calculate the next position using modulus
     * insert the element in the calculated position
     * increment the size
     *
     * @param elem the element to add
     * */
    public void enqueue(T elem){
        if(this.size == this.array.length){
            this.array = Arrays.copyOf(this.array, 2 * this.size);
        }

        this.tail = (this.tail + 1) % this.array.length;
        this.array[this.tail] = elem;
        this.size++;
    }

    public T dequeue(){
        if(this.size == 0){
            throw new IllegalStateException("Queue is empty");
        }

        T elem = this.array[this.head];
        this.array[this.head] = null;
        this.head = (this.head + 1) % this.array.length;
        this.size--;

        return elem;

    }

    public T peek(){
        return this.array[this.head];
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public int size(){
        return this.size;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Elements: [");

        for(int i = 0; i < this.size; i++){
            sb.append(this.array[(this.head + i) % this.array.length]);
            if(i != this.size - 1){
                sb.append(", ");
            }
        }

        sb.append("]");
        return sb.toString();
    }

}
