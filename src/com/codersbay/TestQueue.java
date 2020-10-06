package com.codersbay;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestQueue {

    @Test
    public void testIfQueueListIsEmpty() {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        assertEquals(4, queue.queueList.size());
    }

    @Test
    public void testIfNewIntegerIsAdded() {
        Queue queue = new Queue();
        queue.enqueue(1);
        assertEquals(1, queue.queueList.get(0));
    }

    @Test
    public void testIfTheFirstElementIsRemoved() {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.dequeue();
        assertEquals(2, queue.queueList.get(0));
    }

    @Test
    public void testIfTheFirstNumbersAreRemoved() {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.dequeue(2);
        assertEquals(2, queue.queueList.size());
        assertEquals(3, queue.queueList.get(0));
        assertEquals(4, queue.queueList.get(1));
    }
}
