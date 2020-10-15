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
        try {
            queue.dequeue(4);
        } catch (QueueTooSmallException e) {
            e.printStackTrace();
        }
        queue.size();
        queue.enqueue(22);
        queue.enqueue(25);
        queue.enqueue(34);
        queue.enqueue(16);
        queue.enqueue(39);
        try {
            queue.dequeue(4);
        } catch (QueueTooSmallException e) {
            e.printStackTrace();
        }
        queue.size();


        Queue queue1 = new Queue();
        queue1.enqueue(15);
        queue1.enqueue(24);
        queue1.enqueue(36);
        queue1.enqueue(99);
        queue1.enqueue(857);
        queue1.size();
        try {
            queue.dequeue(4);
        } catch (QueueTooSmallException e) {
            e.printStackTrace();
        }
        queue1.size();
        try {
            queue.dequeue(4);
        } catch (QueueTooSmallException e) {
            e.printStackTrace();
        }
        queue1.size();


        Queue queue2 = new Queue();
        try {
            queue.dequeue(4);
        } catch (QueueTooSmallException e) {
            e.printStackTrace();
        }
    }
}
