package module1.basicjava;

//b) What happens within the package	

public class AccessSpecifierForMethod2 
{
	public static void main(String[] args) 
	{
		AccessSpecifierForMethod1 a=new AccessSpecifierForMethod1();
		AccessSpecifierForMethod1.add(); //calling static methods from another class
		AccessSpecifierForMethod1.sub();
		a.mul(); //calling non static method from another class
	}
}
