
public class Demo7 {
	public static void main(String []args) {
		String s1=new String("RAMA");
		String s2="RAMA";
		if(s1==s2) {
			System.out.println("Reference are equal");
		}
		else {
			System.out.println("Reference are unequal");
		}
		if(s1.equals(s2)) {
			System.out.println("String are equal");
		}
		else {
			System.out.println("Strings are unequal");
		}
	}
 
}
