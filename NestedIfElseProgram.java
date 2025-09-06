package module1.basicjava;

public class NestedIfElseProgram 
{

	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		int c=30;
		if(a<b)
		{
			if(a<c)
			{
				System.out.println("a is less than both b and c");
				if(c==40)
				{
					System.out.println("Satisfying all conditions");
				}
			}
			else
			{
				System.out.println("a is less than b but not c");
			}
		}
		else
		{
			System.out.println("a is greater than b");
		}
	
	}

}
