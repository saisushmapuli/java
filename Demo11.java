
public class Demo11 {
	public static void main(String []args) {
		String s1="Saurav";
		String s2="Saurav";
		if(s1.compareTo(s2)>0) {
			System.out.println("String 1 is greater than String 2");
		}
		else if(s1.compareTo(s2)<0) {
			System.out.println("String 2 is grater than String 1");
		}
		else
		{
			System.out.println("Strings are equal");
		}
	}

}
