import java.util.Scanner;

public class ADD {

	public static void main(String[] args) {
		int x,y,sum;
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter The Numbers");
		x=scan.nextInt();
		y=scan.nextInt();
		sum=x+y;
		System.out.println("sum="+sum);

	}

}
