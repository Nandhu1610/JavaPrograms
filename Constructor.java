package module1.basicjava;

public class Constructor 
{
	Constructor()
	{
		System.out.println("Constructor 1");
	}
	
	Constructor(int a)
	{
		System.out.println("Constructor 2");
	}

	public static void main(String[] args)
	{
		//Constructor c = new Constructor(); //one way to create an object
		//Constructor c1= new Constructor(10);
		//Constructor c2= new Constructor("Nandhini");
		
		new Constructor(); //another way to create an object
		new Constructor(10);
		new Constructor("Nandhini");

	}
	
	Constructor(String name)
	{
		System.out.println("Constructor 3");
	}

}
//c is a reference variable
//new is a keyword