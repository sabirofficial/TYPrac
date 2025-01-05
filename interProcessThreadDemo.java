package com.threading;

public class interProcessThreadDemo extends Thread {
	
	int count=0;//initialize as 0
	
	public void run()
	{
		synchronized(this)
		{
		for(int i=1;i<=10;i++)
		{
			count++;
		}
		this.notify();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		interProcessThreadDemo th1=new interProcessThreadDemo();
		th1.start();
//		System.out.print(th1.count);
		
		synchronized(th1)

		{
			th1.wait();
			System.out.print(th1.count);
		}
		
	}

}
