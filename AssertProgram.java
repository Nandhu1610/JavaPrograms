package module1.basicjava;

public class AssertProgram 
{

	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		//One way
		//assert a==b;
		//Another way 
		assert a>b:"A and B are not equal";
		System.out.println("A and B are equal. lets Add them now");

	}

}
