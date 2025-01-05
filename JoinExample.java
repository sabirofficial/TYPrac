package com.threading;

class MyThreadJoin extends Thread {
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + " started.");
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + " : " + i);
//         
        }
        System.out.println("Thread " + Thread.currentThread().getName() + " finished.");
    }
}

public class JoinExample {
    public static void main(String[] args) throws InterruptedException {
    	MyThreadJoin thread1 = new MyThreadJoin();
        thread1.setName("Thread 1");
        thread1.start(); 

        System.out.println("Main thread: Waiting for Thread 1 to finish...");
        thread1.join(); // Main thread waits for thread1 to complete

        System.out.println("Main thread: Thread 1 has finished.");
    }
}