package com.threading;

class MyThreadSleep extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " - Thread is running...");
            try {
                // Sleep for 1000 milliseconds (1 second)
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // Handle the exception if the thread is interrupted
                System.out.println("Thread was interrupted");
                e.printStackTrace();
            }
              }
    }
}

public class sleepEg {
    public static void main(String[] args) {
    	MyThreadSleep thread = new MyThreadSleep(); // Create a new thread
        thread.start(); // Start the thread
       
    }
}

