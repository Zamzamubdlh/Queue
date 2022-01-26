package com.queue;

import java.util.NoSuchElementException;

public class ArrayQueue {
    private DataMhs[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity) {
        queue = new DataMhs[capacity];
    }

    public void add(DataMhs product) {
        if (back == queue.length) {
            DataMhs[] newArray = new DataMhs[2 * queue.length];
            System.arraycopy(queue, 0, newArray, 0, queue.length);
            queue = newArray;
        }

        queue[back] = product;
        back++;
    }

    public DataMhs remove() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        DataMhs product = queue[front];
        queue[front] = null;
        front++;
        if (size() == 0) {
            front = 0;
            back = 0;
        }
        return product;
    }

    public DataMhs peek() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }
        return queue[front];
    }

    public int size() {
        return back - front;
    }

    public void printQueue() {
        for (int i = front; i < back; i++) {
            System.out.println(queue[i]);
        }
    }
}
