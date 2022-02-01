import java.util.Scanner;

public class Vowel_Consonants {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		char ch=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the character ");
		ch=scan.next().charAt(ch);
		if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
		System.out.println(ch+"is a vowel");
		else
		System.out.println(ch+" is a consonant");

	}

}
