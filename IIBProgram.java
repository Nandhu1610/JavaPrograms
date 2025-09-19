package module3.basicjava;

public class IIBProgram 
{
	{
		System.out.println("Instance Initialization Block 1"); //Instance Initialization Block
	}
	{
		System.out.println("Instance Initialization Block 2");//Instance Initialization Block
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Method");
		IIBProgram i1=new IIBProgram();
		
	}

}
