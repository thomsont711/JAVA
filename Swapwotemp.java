import java.util.Scanner;

public class Swapwotemp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int a,b;
		Scanner scan=new Scanner(System.in);

		System.out.print("Enter value of a: ");
		a=scan.nextInt();
		System.out.print("Enter value of : ");
		b=scan.nextInt();

		System.out.println("Before swapping - a: "+ a +", b: " + b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping  - a: "+ a +", b: " + b);
	}

}
