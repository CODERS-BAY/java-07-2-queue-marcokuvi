package com.codersbay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Queue {

    List<Integer> queueList = new ArrayList<>();

    public void enqueue(int newElement) {
        queueList.add(newElement);
    }

    public int size() {
        int size = queueList.size();
        System.out.println(queueList.toString());
        System.out.println(size);
        return size;
    }

    public int dequeue() {
        if (queueList.size() == 0) {
            throw new Error("QueueTooSmallException");
        } else {
            int firstElement = queueList.get(0);
            queueList.remove(0);
            System.out.println(firstElement);
            return firstElement;
        }
    }

    public int[] dequeue(int n) {
        ArrayList<Integer> numbers = new ArrayList<>();
        if (queueList.size() == 0) {
            throw new Error("QueueTooSmallException");
        } else {
            int i = 0;
            while (i < n) {
                numbers.add(queueList.get(0));
                queueList.remove(0);
                i++;
            }
        }
        int[] firstNumbers = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            firstNumbers[i] = numbers.get(i);
        }
        System.out.println(Arrays.toString(firstNumbers));
        return firstNumbers;
    }
}