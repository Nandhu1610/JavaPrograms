package module1.basicjava;

public class GlobalVariable 
{
	int noofdaysinjanuary=31; //Global Variable - instance variable
	static int daysinyear=365; //Global Variable
	
	void add(int a, int b) //a and b are local variable
	{
		int sum = a+b; //sum is local variable
		System.out.println(sum);
	}
	
	static void add()
	{
		int totaldays=daysinyear*2;
		System.out.println(totaldays);
	}

	public static void main(String[] args) 
	{
		int a=10; //Local Variable
		System.out.println(a);
		add();
		System.out.println(daysinyear);
		GlobalVariable gv = new GlobalVariable();
		System.out.println(gv.noofdaysinjanuary);
	}

}
