package module1.basicjava;

public class LogicalOperators 
{

	public static void main(String[] args) 
	{
		int age=20;
		char gender='M';
		int a=20;
		if(age>=18 && gender=='M')
		{
			System.out.println("Person can vote 1");
		}
		if(age>=18 || gender=='M')
		{
			System.out.println("Person can vote 2");
		}
		if(age>=18 && gender=='F')
		{
			System.out.println("Person can vote 3");
		}
		if(age>=18 || gender=='F')
		{
			System.out.println("Person can vote 4");
		}
		if(age>=18 && ((gender=='F' || a==20) && a>10)) //As per BODMAS rule, inner bracket will execute first.
		{
			System.out.println("Person can vote 5");
		}
		
		//NAND & NOR
		if(!(age>=18 && gender=='M'))
		{
			System.out.println("Person can vote 6");
		}
		if(!(age>=18 || gender=='M'))
		{
			System.out.println("Person can vote 7");
		}
		if(!(age>=18 && gender=='F'))
		{
			System.out.println("Person can vote 8");
		}
		if(!(age>=18 || gender=='F'))
		{
			System.out.println("Person can vote 9");
		}
		

	}

}
