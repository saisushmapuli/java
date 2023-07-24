package Example;
import java.util.Scanner;
public class Character {
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a character to check for digit or vowel or consonent");
		char ch=scan.next().charAt(0);
		identifyCharacter(ch);
	}
	public static void identifyCharacter(char ch) {
		if(Character.isDigit(ch))
		{
			System.out.println("Entered character "+ch+ "is Digit...");
		}
		else if(!Character.isLetter(ch)) {
			System.out.println("Entered character "+ch+ "is special Character");
			
		}
		else {
			switch(Character.toLowerCase(ch)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				if(Character.isLowerCase(ch)) {
					System.out.println("Entered Character"+ch+ "is Upper Case Vowel");
				}
				break;
				default:
					if(Character.isLowerCase(ch)) {
						System.out.println("Enter Character"+ch+ "is Lower Case Consonent");
					}
					else {
						System.out.println("Enter character" +ch+ "is Upper Case Consonent");
					}
			}
		}
	}
}

	
	

}
