package com.threading;

class MyThreadInterupt extends Thread {
	
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread " + getName() + ": " + i);
                Thread.sleep(500); 
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + getName() + " interrupted!");
           
        }
    }
}

public class InterruptExample {
    public static void main(String[] args) throws InterruptedException {
    	MyThreadInterupt thread = new MyThreadInterupt();
    	
    	thread.setName("MyThread");
        thread.start();

        Thread.sleep(2000); // Wait for 2 seconds
        
        thread.interrupt(); // Interrupt the thread

        thread.join(); // Wait for the thread to finish (or be interrupted)
        System.out.println("Main thread: Thread has finished.");
    }
}
