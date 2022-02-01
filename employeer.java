import java.util.Scanner;
class Employer
{
    String name;
    int age;
    int mob;
    String address;
    float salary;
    void print_Salary()
    {
        System.out.print(salary);
    }
}
class Officer extends Employer
{
    String specialization;
}
class Manager extends Employer
{
    String department;
}
public class employeer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        Officer o=new Officer();
	        Manager m=new Manager();
	        System.out.print("Enter the officer's name\n");
	        o.name=sc.next();
	        System.out.print("Enter Address:");
	        o.address=sc.next();
	        System.out.print("Enter Specialization:\n");
	        o.specialization=sc.next();
	        System.out.print("Enter Age:\n");
	        o.age=sc.nextInt();
	        System.out.print("Enter Phone Number:\n");
	        o.mob=sc.nextInt();
	        System.out.print("Enter Salary:\n");
	        o.salary=sc.nextFloat();
	        System.out.println("Enter the manager's Details:\n");
			System.out.print("Enter the manager's name:\n");
			m.name=sc.next();
			System.out.print("Enter Address:\n");
			m.address=sc.next();
			System.out.print("Enter Department:\n");
			m.department=sc.next();
			System.out.print("Enter Age:\n");
			m.age=sc.nextInt();
			System.out.print("Enter PhoneNumber:\n");
			m.mob=sc.nextInt();
			System.out.print("Enter Salary:\n");
			m.salary=sc.nextFloat();
			System.out.println("\nOFFICER DETAILS:\n");
	        System.out.println("Officer's name:"+o.name);
	        System.out.println("Age:"+o.age);
	        System.out.println("Address:"+o.address);
	        System.out.println("PhoneNumber:"+o.mob);
	        System.out.println("\nSpecialization:"+o.specialization);
	       	System.out.print("Salary=\n");
	       	o.print_Salary();
	       	System.out.println();
			System.out.println("MANAGERS DETAILS:\n");
			System.out.println("Manager's name:"+m.name);
			System.out.println("Age:"+m.age);
			System.out.println("Address:"+m.address);
			System.out.println("Phone Number:"+m.mob);
			System.out.println("Department:"+m.department);
			System.out.print("Salary=\n");
			m.print_Salary();

	}

}
