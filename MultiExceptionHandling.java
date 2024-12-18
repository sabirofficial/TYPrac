package com.typractical;

import java.util.Scanner;

public class MultiExceptionHandling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numbers = {10, 20, 30}; 
        int age=102
        		;

        try {
        	
//            int a=100/0;
//        	int b= numbers[9];
//        	int []c=null;
//        	System.out.print(c[0]);
//        	String input="12A";
//        	System.out.print(Integer.parseInt(input));
        	


        	
        	if(age>100)
        	{
        		throw new  Exception("I user ");
        		
        	}
        	 System.out.println("rest of the code");  
        
        	
        } catch (Exception e) {
            System.err.println("Invalid input. Please enter a valid integer."+e);
        } 
       
        System.err.println("mujhe ghar jana hai ");
       
    }
}