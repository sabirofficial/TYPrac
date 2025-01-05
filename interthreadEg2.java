package com.threading;



class inter2Thread1  extends Thread
{
	public void  run()
	{
		synchronized (this) {
			System.out.println(Thread.currentThread().getName());
			this.notify();
		}
		
	}
}


class inter2Thread2  extends Thread
{
	public void  run()
	{
		synchronized (this) {
			System.out.println(Thread.currentThread().getName());
			this.notify();
		}}
}
public class interthreadEg2 {

	public static  void main(String arg[]) throws InterruptedException 
	{inter2Thread1  th1=new  inter2Thread1();
	th1.start();
	inter2Thread2   th2=new  inter2Thread2();
	
	synchronized (th1) {
		th1.wait(10000);	
	}
	th2.start();
	synchronized (th2) {
		th2.wait(10000);	
	}
	
	System.out.println(Thread.currentThread().getName());
	}
}



