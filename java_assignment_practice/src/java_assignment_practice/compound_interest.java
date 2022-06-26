package java_assignment_practice;

import java.util.Scanner;

public class compound_interest {

	public static void main(String[] args) {
		

	

		    // create an object of Scanner class
		    Scanner input = new Scanner(System.in);

		    // take input from users
		    System.out.print("Enter the principal: ");
		    double principal = input.nextDouble();

		    System.out.print("Enter the rate: ");
		    double rate = input.nextDouble();

		    System.out.print("Enter the time: ");
		    double time = input.nextDouble();
		   
		    System.out.print("Enter number of times interest is compounded: ");
		    int number = input.nextInt();
		    
		    double interest = (principal * (time) * rate) / 100; 
		    double compoundinterest = principal * (Math.pow((1 + rate/100), (time*number ))) - principal;//i= p[1+(r/100)]^t -p
                 // compoundamount =principal*(Math.pow((1+rate/100),(time)))
		    System.out.println("Principal: " + principal);
		    System.out.println("Interest Rate: " + rate);
		    System.out.println("Time Duration: " + time);
		    System.out.println("Simple Interest: " + interest);
		    System.out.println("Compound Interest:"+ compoundinterest);

		    
		  }
		}


