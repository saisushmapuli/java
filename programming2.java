package Example1;
import java.util.Scanner;
public class programming2 {
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		int n=100;
		Divisible(n);
		}

	private static void Divisible(int n) {
		for(int num=0;num<n;num++) {
			if(num%2==0) {
				if(num%5==0) {
					System.out.println(num+" ");
				}
			}
		}
	}
}

