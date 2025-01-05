package com.threading;

class HighPriorityThread extends Thread {
    @Override
    public void run() {
    	 for (int i = 0; i < 5; i++) {
             System.out.println("Thread Name: " + Thread.currentThread().getName());
            
         }
    }
}

class LowPriorityThread extends Thread {
    @Override
    public void run() {
    	 for (int i = 0; i < 5; i++) {
             System.out.println("Thread Name: " + Thread.currentThread().getName());
            
         }
    }
}

public class ThreadPriorityExample {
    public static void main(String[] args) {
    	
//    	Thread.currentThread().setPriority(45);
        HighPriorityThread highThread = new HighPriorityThread();
        highThread.setPriority(Thread.MAX_PRIORITY); 
        highThread.setName("high");

        LowPriorityThread lowThread = new LowPriorityThread();
        lowThread.setPriority(Thread.MIN_PRIORITY);
        lowThread.setName("low");

      
        lowThread.start();
        highThread.start();
//        System.out.print(highThread.getPriority());
    
    }
}
