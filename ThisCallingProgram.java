package module1.basicjava;

public class ThisCallingProgram 
{
	ThisCallingProgram(int a, int b) 
	{
		System.out.println("Constructor1");
	}
	
	ThisCallingProgram() 
	{
		this(10,20);
		System.out.println("Constructor2");
	}
	public static void main(String[] args) 
	{
		new ThisCallingProgram();
	}

}
