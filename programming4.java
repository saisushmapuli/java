package Example1;
import java.util.Scanner;
public class programming4 {
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scan.nextInt();
		int count=0;
		for(int i=3;i<=n;i++) {
			int res=checkprime(i);
			if(res!=0)
				System.out.println(res);
			count++;
		}
	System.out.println("Number of prime numbers is =" +count);
	}

	private static int checkprime(int n) {
		for(int i=2;i<=n;i++) {
			if(n%1==0) {
				return 0;
				}
			}
		return n;
	}
}

