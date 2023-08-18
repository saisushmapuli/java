
public class Demo4 {
	public static void main(String []args) {
		String s1="RAMA";
		String s2="SITA";
		String s3="RAMA"+"SITA";
		String s4="RAMA"+"SITA";
		if(s3==s4) {
			System.out.println("Reference are equal");
		}
		else {
			System.out.println("Reference are unequal");
		}
		if(s3.equals(s4)) {
			System.out.println("String are equal");
		}
		else {
			System.out.println("Strings are unequal");
		}
	}
 
}
