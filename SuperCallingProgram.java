package module1.basicjava;

class Program1
{
	Program1(int a)
	{
		System.out.println("Constructor1");
	}	
}

class Program2 extends Program1
{
	Program2()
	{
		super(10);
		System.out.println("Constructor2");		
	}
}

class Program3 extends Program2
{
	Program3()
	{
		System.out.println("Constructor3");	
	}
}

public class SuperCallingProgram extends Program3
{
	public SuperCallingProgram() 
	{
		System.out.println("Constructor4");
	}

	public static void main(String[] args) 
	{
		new SuperCallingProgram();
	}

}
