package com.kodnest.training.loops;
import java.util.Scanner;
public class CalculatorApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Calculator calculator=new Calculator();
		System.out.println("Hello user welcome To kodnestCaculator....");
		while(true)
		{
		System.out.println("+ =====> Addition");
		System.out.println("- =====> Subtraction");
		System.out.println("* =====> Multiplication");
		System.out.println("/ =====> Division");
		System.out.println("% =====> FindRemainder");
		System.out.println("^ =====> FindSquare");
		System.out.println("! =====> To stop");
		System.out.println("Enter your choice");
		char ch=scan.next().charAt(0);
		switch(ch) {
		case '+' :calculator.addition();	
		             break;
		case '-' :calculator.Subtraction();
                    break;
		case '*' :calculator.Multiplication();	
                      break;
		case '/' :calculator.Division();	
                      break;
		case '%' :calculator.FindRemainder();	
                      break;
		case '^' :calculator.FindSquare();	
                      break;
		case '!' :return;	
        default  :System.out.println("Go TO Vaasan eye care check your eyes...See the properly and enter valid choice");
		}
		}
	}
}
