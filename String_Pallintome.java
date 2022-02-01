import java.util.Scanner;

public class String_Pallintome {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String word,rev = "";
		int len;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter The string");
		word=scan.next();
		len=word.length();
		for(int i=len-1;i>=0;i--)
		rev=rev+word.charAt(i);
		if(word.equals(rev))
		System.out.println(word+" is a pallindrome");
		else
		System.out.println(word+ " is not a pallindrome");

	}

}
