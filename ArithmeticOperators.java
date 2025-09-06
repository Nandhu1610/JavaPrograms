package module1.basicjava;

public class ArithmeticOperators 
{
	//instead of creating a and b value in each method, we can declare it globally and utilize in
	//every method
	static int a=50;
	static int b=20;
	static void add()
	{
		//int a=10; //local variable
		//int b=20;
		int c=a+b;
		System.out.println(c);
	}
	
	static void sub()
	{
		//int a=10;
		//int b=20;
		int c=a-b;
		System.out.println(c);
	}
	
	static void mul()
	{
		//int a=10;
		//int b=20;
		int c= a*b;
		System.out.println(c);
	}

	static void div()
	{
		//int a=10;
		//int b=20;
		int c= a/b;
		System.out.println(c);
	}
	
	static void mod()
	{
		//int a=10;
		//int b=20;
		int c= b%a;
		System.out.println(c);
	}
	
	public static void main(String[] args) 
	{
		add();
		sub();
		mul();
		div();
		mod();
	}

}
