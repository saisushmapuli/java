package Arrays;
import java.util.Scanner;
public class Arrays1 {
	public static void main(String [ ]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 1D length");
		int arr[][]=new int[scan.nextInt()][];
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter length of 2D for 1D");
			arr[i]=new int[scan.nextInt()];
		}
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.println("Enter the score of game"+i+"player"+j);
				arr[i][j]=scan.nextInt();
			}
		}
		System.out.println("Array contents Are..");
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.print(arr[i][j]+"");
			}
			System.out.println();
		}
	}
}

