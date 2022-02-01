import java.util.Scanner;

public class EvenorOdd {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		num=sc.nextInt();
		if(num%2==0) 
			System.out.println(num+" is even");
		else
			System.out.println(num+" is odd");
		// TODO Auto-generated method stub

	}

}
