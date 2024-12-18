package com.typractical;


import java.util.Scanner;

public class throwsEg  {
	// t
	public void method1() throws ArithmeticException
	{
		int a=110/0;
	}

	//H
    public static void main(String[] args) {
    	throwsEg e=new throwsEg();
    	try {
    		e.method1();
    	}catch(ArithmeticException p)
    	{
    		System.out.println(p);
    	}
    	
    	
    	
    }
}
