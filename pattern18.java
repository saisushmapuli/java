package Statement;
import java.util.Scanner;
public class pattern18 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows to print the pattern ");

        int rows = scanner.nextInt();
        for (int i = rows; i >= 1; i--)
        {
            for (int j = i; j < rows; j++)
            {
                System.out.print(j + " ");
            }

            for (int k = rows - i; k < rows; k++)
            {
                System.out.print(5 + " ");
            }
            System.out.println();
        }
    }
}



