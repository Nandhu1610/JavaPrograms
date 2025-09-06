package module1.basicjava;

class ParentProgram
{
	static void login() //this method is being overridden
	{
		System.out.println("Login to application with mobile no");
	}
}
public class MethodOverriding extends ParentProgram
{
	static void login()
	{
		//super.login(); //==>super keyword used to call the parent class method
		System.out.println("Login to application with email id");
	}
	public static void main(String[] args) 
	{
		//MethodOverriding a= new MethodOverriding();
		login();
	}

}
