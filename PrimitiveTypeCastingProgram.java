package module3.basicjava;

public class PrimitiveTypeCastingProgram 
{

	public static void main(String[] args) 
	{
		//int into double
		int b=86;
		double b1=b; //widening-implicit
		System.out.println(b1);
		
		double b2=(double) b;
		System.out.println(b2); //widening-explicit
		
		//double into int
		double q=74.63;
		int q1=(int) q; //narrowing-explicit
		System.out.println(q1);
		
		//int into long
		int a=100;
		long a1=a; //widening-implicit
		System.out.println(a1);
		
		long a2=(long) a; //widening-explicit
		System.out.println(a2);
	}

}
