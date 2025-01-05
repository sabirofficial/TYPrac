package com.threading;


public class RaceConditionSyncBlock{

	
	    static int counter = 0; 

	
    
   synchronized void incre()
    {
    	
    
    	 counter++;  //Remove the synchronized block and see the output
		
	
    }

    public static void main(String[] args) throws InterruptedException {
    	RaceConditionSyncBlock rc=new RaceConditionSyncBlock();
    	class MyThread1 extends Thread {

    	    @Override
    	    public void run() {
    	    	for (int i = 0; i < 5; i++) {
                   rc.incre();
    	    		
                }
    	        
    	    }
    	}
    	class MyThread2 extends Thread {

    	    @Override
    	    public void run() {
    	        // Code to be executed by the thread
    	    	for (int i = 0; i < 5; i++) {
    	    		rc.incre();
    	    		
                }
    	    }
    	}
    	MyThread1 thread1= new MyThread1();

    	MyThread2 thread2= new MyThread2();
        thread1.start();
        thread2.start();
        
        thread1.join();
        thread2.join();
      

        System.out.println("Final counter value: " + counter); 
    }
}

