import java.util.Scanner;
public class GalacticArithemetic {
	public static void main(String [] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter your num1 ");
		long num1=scan.nextLong();
		System.out.println("Enter your num2 ");
		long num2=scan.nextLong();
		System.out.println("The result is "+Addition.galacticAddition(num1,num2));
	}
}
public class Addition {
	public static long galacticAddition(long num1,long num2)
	{
		return num1+num2;
	}

}

