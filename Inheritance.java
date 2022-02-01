import java.util.Scanner;
class employee
{ int basic_sal;
  int ta;
  int da;
  int net_sal;
  Scanner sc= new Scanner(System.in);
 void getData()
  { System.out.println("Enter the basic salary of the employee:");
        basic_sal=sc.nextInt();
        System.out.println("Enter the TA of the employee:");
        ta=sc.nextInt();
        System.out.println("Enter the DA of the employee:");
        da=sc.nextInt();      
}
  void calcNet()
  { System.out.println("Net salary of the employee:"+(basic_sal+ta+da));}
}
class engineer extends employee
{
 void calcEngSal()
  {System.out.println("Salary of the engineer:"+(basic_sal+ta+da)*2);
}
 }
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		engineer en=new engineer();
		en.getData();
		en.calcNet();
		en.calcEngSal();

	}

}
