package com.codersbay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Queue {

    private List<Integer> queueList = new ArrayList<>();

    public List<Integer> getQueueList() {
        return queueList;
    }

    public void setQueueList(List<Integer> queueList) {
        this.queueList = queueList;
    }

    public void enqueue(int newElement) {
        queueList.add(newElement);
    }

    public int size() {
        int size = queueList.size();
        System.out.println(queueList.toString());
        System.out.println(size);
        return size;
    }

    public int dequeue() throws QueueTooSmallException {
        if (queueList.isEmpty()) {
            throw new QueueTooSmallException();
        } else {
            int firstElement = queueList.remove(0);
            System.out.println(firstElement);
            return firstElement;
        }
    }

    public int[] dequeue(int n) throws QueueTooSmallException {
        ArrayList<Integer> numbers = new ArrayList<>();
        if (queueList.isEmpty()) {
            throw new QueueTooSmallException();
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