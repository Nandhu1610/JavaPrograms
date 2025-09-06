package module1.basicjava;

public class MethodOverloading 
{
	void add(int a, double b)
	{
		double sum = a+b;
		System.out.println(sum);
	}
	
	static void add(int a, int b)
	{
		int sum = a+b;
		System.out.println(sum);
	}
	
	void add(double a, double b)
	{
		double sum = a+b;
		System.out.println(sum);
	}

	public static void main(String[] args) 
	{
		MethodOverloading m = new MethodOverloading();
		m.add(10,10.568);
		add(10,20);
		m.add(10.565, 20.57898);

	}

}
