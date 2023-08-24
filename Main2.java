
public class Main2 {
	public static void main(String []args) {
		String s1=new String("RAJA RAM MOHAN ROY");
		System.out.println(s1.length());
		String s2=s1.replace('A', 'R');
		System.out.println(s2);
		String s3=s1.replaceAll("Aaja", "RAJA");
		System.out.println(s3);
		System.out.println("+++++++++++++++++");
		String str=new String("omkar");
		String str1=str.intern();
		System.out.println(str1);
		String str2="omkar";
		if(str1==str2) {
			System.out.println("Reference are equal ");
		}
		else {
			System.out.println("Reference are unequal ");
		}
		System.out.println("+++++++++++++++++++");
		String string=new String("RAVANA BRAHAMA");
		char arr[]=string.toCharArray();
		System.out.print("arr---->");
		int i=0;
		do {
			System.out.print(arr[i]+" | ");
			i++;
		}while(i<=arr.length-1);
		}
		
		}
	
	
		
	

		
		
		

