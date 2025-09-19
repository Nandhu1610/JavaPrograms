package module2.basicjava;

public class ReverseAString 
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
	}

}
/*
i=7,c1=i,output=i
i=6,c1=n,output=in
i=5,c1=i,output=ini
i=4,c1=h,output=inih
i=3,c1=d,output=inihd
i=2,c1=n,output=inihdn
i=1,c1=a,output=inihdna
i=0,c1=n,output=inihdnan
*/