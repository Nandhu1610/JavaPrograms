package module1.basicjava;

abstract class AmazonLoginFeature
{
	abstract void loginWithOtp();
	abstract void loginWithoutOtp();
}
public class AbstractClass extends AmazonLoginFeature
{

	public static void main(String[] args) 
	{
		

	}

	@Override
	void loginWithOtp() 
	{
		System.out.println("Real Logic 1");
	}

	@Override
	void loginWithoutOtp() 
	{
		System.out.println("Real Logic 2");
	}

}
