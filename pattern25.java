package Statement;
	import java.util.Scanner;

	public class pattern25
	{
		public static void main(String[] args)
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the number of rows to print the pattern ");
			int rows = scanner.nextInt();
			int temp = 1;
					for(int i = 1; i <= rows; i++) {
			        for (int l = rows; l > i; l--)
				{
					System.out.print(" ");
				}
				for (int j = 1; j <= (i * 2 - 1); j++)
				{
					System.out.print((int) Math.pow(temp, 2) + " ");
					temp++;
				}
				System.out.println();
			}
		}
	}



