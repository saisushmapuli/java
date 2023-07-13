package com.kodnest.training.loops;
import java.util.Scanner;
public class Calculator {
	Scanner scan=new Scanner(System.in);
	void addition() {
		System.out.println("Enter 2 numbers for addition");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("Addition of "+a+ " and "+b+ "is "+(a+b));
	}
	void Subtraction() {
		System.out.println("Enter 2 numbers for subtraction");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("subtraction of "+a+ " and "+b+ "is "+(a-b));
	}
	void Multiplication() {
		System.out.println("Enter 2 numbers for multiplication");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("multiplication of "+a+ " and "+b+ "is "+(a*b));
	}
	void Division() {
		System.out.println("Enter 2 numbers for division");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("division of "+a+ " and "+b+ "is "+(a/b));
	}
	void FindRemainder() {
		System.out.println("Enter 2 numbers for finding Remainder");
	    int a=scan.nextInt();
	    int b=scan.nextInt();
	    System.out.println("Remainder of "+a+ " is divided by "+b+ "is "+(a%b));
	}
	void FindSquare() {
		System.out.println("Enter a number for square");
		int a=scan.nextInt();
		System.out.println("Square of a number "+a+ " is " +(a*a));	
	}

}
