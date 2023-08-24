
public class Demo15 {
	public static void main(String []args) {
		StringBuffer s1=new StringBuffer();
		System.out.println(s1.capacity());
		s1.append("Sachin is a Batsman");
		System.out.println(s1.capacity());
		s1.append("He Lives In Mumbai");
		System.out.println(s1.capacity());
		System.out.println("===================");
		StringBuilder sb=new StringBuilder();
		System.out.println(sb.capacity());
		sb.append("Saurav is a Batsman");
		System.out.println(sb.capacity());
		sb.append("He Lives In Mumbai");
		System.out.println(sb.capacity());
		
	}

}
