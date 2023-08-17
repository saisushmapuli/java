package Statement;
	import java.util.Scanner;

	public class pattern22
	{
	    public static void main(String[] args)
	    {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the number of rows to print the pattern ");

	        int rows = scanner.nextInt();
	        for (int i = rows; i >= 1; i--)
	        {
	            for (int j = rows; j >= 1+rows-i; j--)
	            {
	                System.out.print(j);
	            }
	            
	            for (int j= i*2 ; j < rows*2-1; j++)
	            {
	                System.out.print(" ");
	            }
	            
	            for (int l = 1+rows-i; l <=rows; l++)
	            {
	                if(l!=1)
	                    System.out.print(l);
	            }
	            System.out.println();
	        }
	        scanner.close();
	    }
	}

