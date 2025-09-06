package module1.basicjava;

public class IfElseIfProgram 
{

	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		if(a!=b)
		{
			System.out.println("If Block"); //condition true
		}
		
		else if(a<b)
		{
			System.out.println("Else If Block"); //condition true
		}
		else
		{
			System.out.println("Else");
		}

	}

}
