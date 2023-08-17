package Statement;
import java.util.Scanner;
public class pattern24 {
		public static void main(String[] args)
	    {
	        // Create a new Scanner object
	        Scanner scanner = new Scanner(System.in);

	        // Get the number of rows from the user
	        System.out.println("Enter the number of rows to print the pattern ");

	        int rows = scanner.nextInt();
	        System.out.println("** Printing the pattern... **");
	        for (int i = 0; i <= rows; i++)
	        {
	        	int x = 0;
	        	int y = 1;
	        	System.out.print(y+" ");
	            for (int j = 0; j < i; j++)
	            {
	            	int z = x + y;
	            	System.out.print(z + " ");
	            	x = y;
	            	y = z;
	            }
	            System.out.println();
	        }
	    }
	}


