package com.threading;


	class Threadjoin1 extends Thread {
	    @Override
	    public void run() {
	    	Thread.currentThread().setName("thread1");
			
	        for (int i = 0; i < 5; i++) {
	            System.out.println("Thread " + Thread.currentThread().getName() );
	           
	        }
	    }
	}
	class Threadjoin2 extends Thread {
	    @Override
	    public void run() {
	    	Thread.currentThread().setName("thread2");
	        for (int i = 0; i < 5; i++) {
	            System.out.println("Thread " + Thread.currentThread().getName() );
	           
	        }
	    }
	}
public class joinDemo {
	public static void main(String[] args) {
		Threadjoin1 t1=new Threadjoin1();
		Threadjoin2 t2= new Threadjoin2();
		t1.start();
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
