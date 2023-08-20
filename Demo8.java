
public class Demo8 {
	public static void main(String []args) {
		String s1="sushma";
		String s2="SUSHMA";
		if(s1==s2) {
			System.out.println("Reference are equal");
		}
		else
		{
			System.out.println("Reference are unequal");
		}
		if(s1.equals(s2)) {
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings are unequal");
		}
	}

}
