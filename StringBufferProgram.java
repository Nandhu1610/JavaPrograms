package module2.basicjava;

public class StringBufferProgram 
{

	public static void main(String[] args) 
	{
		StringBuffer s=new StringBuffer("Automation Testing");
		//s.append(" Manual");
		//s.insert(10, " API"); //10 is index position
		//s.delete(11, s.length());
		//s.replace(11, s.length(), "with Selenium Java");
		System.out.println(s.substring(11));
		System.out.println(s.substring(11,14));
		System.out.println(s); 
		
		StringBuffer s1=new StringBuffer("manual");
		System.out.println(s1.reverse());
		char c=s1.charAt(1);
		System.out.println(c);
	}

}
