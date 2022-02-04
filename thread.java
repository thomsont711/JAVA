package oopj;
import java.util.*;
class multab{
void num(int n) {
	synchronized(this) {
		for(int i=1;i<=5;i++) {
			System.out.println(n+"*"+i+"="+(n*i));
			try {
					Thread.sleep(400);
				}
				catch(Exception e){
					System.out.println(e);
				}
			}
		}
	}
} 
class mytab extends Thread{
	multab t;
	int num;
	mytab(multab t,int num){
		this.t=t;
		this.num=num;
	}
	public void run() {
		t.num(num);
	}
}

public class thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 multab ob=new multab();
	     Scanner sc=new Scanner(System.in);
	     System.out.println("enter the table you want torun by thread1:");
	     int num=sc.nextInt();
	     mytab t1=new mytab(ob,num);
	     System.out.println("enter the table you want torun by thread2:");
	     num=sc.nextInt();
	     mytab t2=new mytab(ob,num);
	     System.out.println("enter the table you want torun by thread3:");
	     num=sc.nextInt();
	     mytab t3=new mytab(ob,num);
	     t1.start();
	     t2.start();
	     t3.start();

	}

}
