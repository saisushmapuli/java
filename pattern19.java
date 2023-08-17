package Statement;
import java.util.Scanner;
public class pattern19 {
	    public static void main(String[] args)
	    {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the number of rows to print the pattern ");

	        int rows = scanner.nextInt();
	        int temp = 1;
	        for(int i=1; i<=rows/2+1; i++)
	        {
	            for(int j=1;j<=i;j++)
	            {
	                System.out.print(temp*j+" ");
	            }
	            System.out.println();
	            temp++;
	        }
	        for(int i=1; i<=rows/2; i++)
	        {
	            for(int j=1;j<=rows/2+1-i;j++)
	            {
	                System.out.print(temp*j+" ");
	            }
	            System.out.println();
	            temp++;
	        }
	    }
	}

