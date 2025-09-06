package module1.basicjava;

public class ConstructorOverloading 
{
	ConstructorOverloading(char a,int b)
	{
		this(45,65);
		System.out.println("Constructor 3");
	}
	ConstructorOverloading(int a,int b)
	{
		this(85.65);
		System.out.println("Constructor 1");
	}
	ConstructorOverloading()
	{
		this('W',90);
		System.out.println("Constructor 2");
	}
	ConstructorOverloading(double a)
	{		
		System.out.println("Constructor 4");
	}
	
	public static void main(String[] args)
	{
		new ConstructorOverloading();			
	}

}
