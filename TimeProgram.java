package module2.basicjava;

import java.util.Date;

public class TimeProgram 
{
	public static void main(String[] args) 
	{
		Date d1=new Date();
		System.out.println(d1.getTime()); //getting the current time which is machine readable
		
		Date d2=new Date(d1.getTime()); //converting epoch time to human readable time
		System.out.println(d2); 
		
		//Date d3=new Date(d1.getTime()-(1000*60*60*24*30l)); //past date
		//Date d3=new Date(d1.getTime()+(1000*60*60*24*30l)); //future date
		
		String format1=d2.toString(); //converting the time to string
		System.out.println(format1);
		
		String date=format1.substring(8, 10);
		String month=format1.substring(4, 7);
		String year=format1.substring(format1.length()-4);
		System.out.println(date);
		System.out.println(month);
		System.out.println(year);
        System.out.println(date.concat(month).concat(year));
        System.out.println(date.concat(" ").concat(month).concat(" ").concat(year));
        System.out.println(date.concat("/").concat(month).concat("/").concat(year));
        System.out.println(date.concat("-").concat(month).concat("-").concat(year));
	}
}
