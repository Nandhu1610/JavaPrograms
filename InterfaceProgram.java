package module1.basicjava;

interface AmazonLoginProgram
{
	void loginOtp();
	void loginWithoutOtp();
}
public class InterfaceProgram implements AmazonLoginProgram
{

	public static void main(String[] args) 
	{
		

	}

	@Override
	public void loginOtp() 
	{
		System.out.println("Login will stay with us");
	}

	@Override
	public void loginWithoutOtp() 
	{
		System.out.println("Login will stay with us");
	}

}
