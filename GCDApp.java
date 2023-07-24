package com.second;
import java.util.Scanner;
public class GCDApp {

	public static void main(String[] args) {
		System.out.println("Enter the two numbers to find GCD");
		Scanner scan=new Scanner(System.in);
		int m=scan.nextInt();
		int n=scan.nextInt();
		GCD gcd=new GCD();
		int res=gcd.findGCD(m,n);
		System.out.println("GCD of " +m+ " AND " +n+" Is " +  res);
		
	 

	}

}
