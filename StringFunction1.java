package module2.basicjava;

public class StringFunction1 
{

	public static void main(String[] args)
	{
		String a="Automation";
		int size=a.length();
		System.out.println(size);
		
		int index=a.indexOf('m');
		System.out.println(index);
		
		String uc=a.toUpperCase();
		System.out.println(uc);
		
		String s=a.concat(" Testing");
		System.out.println(s);
		
		boolean b=a.contains("t");
		System.out.println(b);
		
		System.out.println(a.equals("automation"));
		System.out.println(a.equalsIgnoreCase("automation"));
		
		System.out.println(a.charAt(1));
		
		System.out.println(a.substring(2));
		System.out.println(a.substring(2,5)); //will give 0-4 index position
		
		String a1="Manual";
		System.out.println(a1.replace('M','m'));
		System.out.println(a1.replace("Manual", "API"));
		System.out.println(a.trim());
		
		String s1="k v no 21";
        //WAP to replace all numeric values 
        System.out.println(s1.replaceAll("[0-9]","Bangalore"));
        
        //WAP to replace all capital letter
        String s2="The United State Of Abc";
        System.out.println(s2.replaceAll("[A-Z]", ""));
        
        
        //WAP to replace all smaller letters
        System.out.println(s2.replaceAll("[a-z]", ""));
        String output= s2.replaceAll("[a-z]", "");
        System.out.println(output.toLowerCase());
		System.out.println(s2.toLowerCase());
	}

}
