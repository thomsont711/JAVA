import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,div;
        int ch =0;
        Scanner sc = new Scanner(System.in);
        while(ch ==0) {
            System.out.print("Enter the first no: ");
            a = sc.nextInt();
            System.out.print("Enter the second no to divide with: ");
            b = sc.nextInt();
            try {
            if(b==0)
            	throw new ArithmeticException("Division by 0 not possible");
            else
            	div=a/b;
            	System.out.println("Result:"+div);
            System.out.print("\nTo continue enter 0 or to exit any other num");
            ch = sc.nextInt();
            }
            finally {
            	System.out.println("End of Operatrion");
            }

	}

	}
}
