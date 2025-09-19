package module2.basicjava;

public class PalindromeProgram 
{

	public static void main(String[] args) 
	{
		String input="Nandhini";
		String output="";
		
		for(int i=input.length()-1;i>=0;i--)
		{
			char c1=input.charAt(i);
			output=output+c1;
		}
		System.out.println("This is Input String-->"+input);
		System.out.println("This is Output String-->"+output);
		if(input.equals(output))
		{
			System.out.println("Given Input is a Palindrome");
		}
		else
		{
			System.out.println("Given Input is Not a Palindrome");
		}
	}

}
