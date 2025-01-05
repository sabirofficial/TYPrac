package com.threading;


class ThreadYield1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + " : " + i);
            Thread.yield(); 
        }
    }
}
class ThreadYield2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + " : " + i);
           
        }
    }
}

public class YieldExample {
    public static void main(String[] args) {
    	ThreadYield1 thread1 = new ThreadYield1();
        thread1.setName("Thread 1"); // Set a name for easier identification

        ThreadYield2 thread2 = new ThreadYield2();
        thread2.setName("Thread 2"); 
        System.out.print("hey i m main");
        thread1.start();
        thread2.start();
    }
}