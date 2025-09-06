package module1.basicjava;

//a) What happens within the class	

public class AccessSpecifierForMethod1 
{
	public static void add()
	{
		
	}	
	protected static void sub()
	{
		
	}	
	void mul()
	{
		
	}	
	private void div()
	{
		
	}
	public static void main(String[] args) 
	{
		AccessSpecifierForMethod1 a1=new AccessSpecifierForMethod1();
		add();
		sub();
		a1.mul();
		a1.div();
	}

}
