package module2.basicjava;

public class StringBuilderProgram 
{
	public static void main(String[] args)
	{
		StringBuilder s=new StringBuilder("Manual Testing");
		//s.append(" with SQL");
		//s.insert(6, " automation ");
		s.delete(6, s.length());
		System.out.println(s);
	}

}
