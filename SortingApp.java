import java.util.Scanner;
public class SortingApp {

		public static void main(String []args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter array elements");
			int arr[]=new int[scan.nextInt()];
			System.out.println("Enter"+arr.length+"Elements");
			for(int i=0;i<=arr.length-1;i++) {
				arr[i]=scan.nextInt();
			}
			System.out.println("Enter the before sorting...");
			for(int x:arr)
			{
				System.out.print(x+" ");
			}
			System.out.println();
			SortingTechniques sortingTechniques=new SortingTechniques();
			sortingTechniques.InsertionSort(arr);
			System.out.println("Enter the after sorting...");
			for(int x:arr)
			{
				System.out.print(x+" ");
			}
		}
}
