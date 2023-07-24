package com.second;

import java.util.Scanner;

public class Sum_Series {
	public static void main(String[] args) {
		double sum=0;
		int n;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no.of terms in series:");
		int n1=scan.nextInt();
		Sum_Series obj=new Sum_Series();
		for(int i=1;i<=n1;i++) {
			sum=sum+(double)i/(obj.fact(i));
			
			
		}
		System.out.println("Sum of Series:"+sum);
		}
		int fact(int x) {
			int mul=1;
			while(x>0) {
				mul=mul*x;
				x--;
			}
			return mul;
		}
}
				



