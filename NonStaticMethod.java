package module1.basicjava;

public class NonStaticMethod 
{
	void add()
	{
		System.out.println("Adding");
	}
	
	void sub()
	{
		System.out.println("Subtracting");
	}
	
	void mul()
	{
		System.out.println("Multiply");
	}

	public static void main(String[] args) 
	{
		NonStaticMethod n1 = new NonStaticMethod();
		n1.add();
		n1.sub();
		n1.mul();
	}

}
