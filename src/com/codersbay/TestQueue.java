package com.codersbay;

import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

public class TestQueue {

    @Test
    public void testSizeIsCorrectAfterMultipleEnqueues() {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        assertEquals(4, queue.size());
    }

    @Test
    public void testIfNewIntegerIsAdded() {
        Queue queue = new Queue();
        queue.enqueue(1);
        assertEquals(1, queue.size());
    }

    @Test
    public void testIfTheFirstElementIsRemoved() throws QueueTooSmallException {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.dequeue();
        assertEquals(2, queue.getQueueList().get(0));
    }

    @Test
    public void testIfTheFirstNumbersAreRemoved() throws QueueTooSmallException {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        int[] ints = {1,2};
        assertArrayEquals(ints, queue.dequeue(2));
        assertEquals(2, queue.size());
    }

    @Test
    public void testIfQueueIsTooSmall() {
        assertThrows(QueueTooSmallException.class, () -> {
            Queue queue = new Queue();
            queue.getQueueList();
            queue.dequeue();
        });
    }
}
