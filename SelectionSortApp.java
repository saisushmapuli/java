import java.util.Scanner;
public class SelectionSortApp {

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
				int min;
				int pos;
				int help;
				for(int i=0;i<=arr.length-2;i++) {
					min=arr[i];
					pos=i;
					for(int j=i+1;j<=arr.length-1;j++) {
						if(arr[j]<min) {
						min=arr[j];
						pos=j;
					}
				}
					//swap arr[i] and arr[pos]
					help=arr[i];
					arr[i]=arr[pos];
					arr[pos]=help;
				}
				System.out.println("Enter the after sorting...");
				for(int x:arr)
				{
					System.out.print(x+" ");
				}
			}
}

