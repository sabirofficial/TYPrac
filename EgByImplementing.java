package com.threading;

class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread Name: " + Thread.currentThread().getName());
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class EgByImplementing {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread1 = new Thread(runnable);
        thread1.setName("Thread 1");
        thread1.start(); 

        Thread thread2 = new Thread(runnable);
        thread2.setName("Thread 2");
        thread2.start();
    }
}