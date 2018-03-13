
/*
 * Print the month in upper case
 */
 

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
 

public class Prog9 {

	/**
	 * @param args
	 */
	public static String output;
	public static String fun(String s)
	{
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf1=new SimpleDateFormat("MMMMM");
		Date d;
		try {
			d = sdf.parse(s);
			String s1=sdf1.format(d).toUpperCase();
			output=s1;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return output;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Prog9.fun("02/06/1990");
System.out.println(output);
	}

}
