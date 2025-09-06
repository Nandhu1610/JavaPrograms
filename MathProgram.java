package module1.basicjava;

public class MathProgram 
{

	public static void main(String[] args) 
	{
		System.out.println(Math.addExact(10, 20));
		System.out.println(Math.subtractExact(20, 10));
		System.out.println(Math.multiplyExact(10, 20));
		System.out.println(Math.max(10.255, 50.5528));
		System.out.println(Math.min(10.255f, 1.24520));
		System.out.println(Math.abs(10));
		System.out.println(Math.random());
		double area = Math.PI*10*10; //r value is 10 as πr^2
		System.out.println(area);
	}

}
