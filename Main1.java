import java.util.Scanner;
public class Main1 {
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array length");
		char arr[]=new char[scan.nextInt()];
		System.out.println("Enter array elements");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.next().charAt(0);
		}
		System.out.print("arr-->");
		for(char c:arr) {
			System.out.print(c+" ");
		}
		System.out.println();
		char arr2[]=new char[arr.length];
		for(int i=0;i<=arr.length-1;i++) {
			arr2[i]=arr[i];
		}
		System.out.print("arr-->");
		for(char c:arr2) {
			System.out.print(c+" ");
		}
			System.out.println();
			char arr3[]=new char[arr2.length];
			int j=arr3.length-1;
			for(int i=0;i<=arr.length-1;i++) {
				arr3[j]=arr2[i];
				j--;
			}
			System.out.print("arr3-->");
			for(char c:arr3) {
				System.out.print(c+" ");
			}
			System.out.println();

			
			
	}

}
