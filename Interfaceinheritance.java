package oopj;
abstract class Animal
	{ 
	  protected int legs;
	  protected Animal(int legs)
	    {
	     this.legs=legs;
	    }
   public void walk()
	   {
     System.out.println("This animal walk by "+legs+" legs.\n");
     }
   public abstract void eat();
	}
	
class Cat extends Animal implements Pet
	{
	  private String catName;
   public Cat()
	   {
	     this("");
	   }
   public Cat(String name)
	   {
       super(4);
	      catName=name;
	   }
	  public void eat()
	   {
	     System.out.println("Cat eat fishes");
	   }
	  public String getName()
	    {
	      return catName;
	    }
	  public void setName(String name)
	    {
	      catName=name;
	    }
	}
	
class Fish extends Animal implements Pet 
	{
	  public Fish() 
	   {
	     super(0);
	   }
	  private String fishName;
	  public void eat()
	    {
	      System.out.println("Fish eat plants");
	    }
	  public String getName() 
	    {
	      return fishName;
	    }
	  public void setName(String name)
	    {
	      fishName = name;
	    }
	  public void walk()
	    {
	      System.out.println("Fish has no legs.\n");
	    }
	    
 }
	
class Spider extends Animal 
	{
	  public Spider()
	   {
	     super(8);
	   }
	  public void eat()
	   {
	     System.out.println("Spider eat insects.");
	   }
	 }
	
interface Pet 
	{
	  public String getName();
	  public void setName(String name);
	}

public class Interfaceinheritance
	{
	  public static void main(String[] args)
	    {
	      Fish d = new Fish();
	      Cat c = new Cat("Moose");
	      Animal a = new Fish();
       Animal e = new Spider();
       Pet p = new Cat();
       d.setName("Mimi");
       System.out.println("Fish");
       System.out.println("This fish's name is : "+d.getName());
       d.eat();
       d.walk();
       System.out.println("Cat");
       System.out.println("This cat's name is : "+c.getName());
       c.eat();
       c.walk();
       System.out.println("Spider");
	      ((Spider)e).eat();
	      ((Spider)e).walk();
	    }
	}