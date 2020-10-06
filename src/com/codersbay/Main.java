package com.codersbay;

public class Main {

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.dequeue(4);
        queue.size();
        queue.enqueue(22);
        queue.enqueue(25);
        queue.enqueue(34);
        queue.enqueue(16);
        queue.enqueue(39);
        queue.dequeue();
        queue.size();


        Queue queue1 = new Queue();
        queue1.enqueue(15);
        queue1.enqueue(24);
        queue1.enqueue(36);
        queue1.enqueue(99);
        queue1.enqueue(857);
        queue1.size();
        queue1.dequeue();
        queue1.size();
        queue1.dequeue(3);
        queue1.size();

    }
}
