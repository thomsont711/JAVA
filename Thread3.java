package oopj;
class NewThread implements Runnable 
{
 String name;
 Thread t;
 NewThread (String threadname)
 { 
  name=threadname;
  t=new Thread(this, name); 
  System.out.println("New thread: " + t); 
  t.start(); 
 }

public void run ()
 {
  try 
   {
	 for (int i=6;i>0;i--)
	 { 
	  System.out.println (name + ": " + i); 
	  Thread.sleep (500);
	 }
	}
  catch (InterruptedException e)
   { 
	 System.out.println (name + "Interrupted");
	}
	System.out.println (name + " exiting.");
	}
 }

public class Thread3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new NewThread ("One");
		  new NewThread ("Two");
		  new NewThread ("Three");
		  
		  try
		  {
		   Thread.sleep (5000); 
		  } 
		  
		  catch (InterruptedException e) 
		   { 
			System.out.println("Main thread Interrupted");
		   }
		   System.out.println("Main thread exiting.");
		   }
		 

	}


