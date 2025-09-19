package module3.basicjava;
class Parent
{
	void method()
	{
		System.out.println("One on One Teaching");
	}
}
public class RunTimePolymorphism extends Parent
{
	void method()
	{
		System.out.println("One to many Teaching");
	}
	public static void main(String[] args) 
	{
		RunTimePolymorphism a1=new RunTimePolymorphism();
		a1.method();
		
		Parent b1=new Parent();
		b1.method();
	}

}
