/*
 * Check if the date is in dd/MM/yyyy format....
 */


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Prog5 {
	public static int output;
	public static int fun(String s)
	{
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date d=sdf.parse(s);
			String s1=sdf.format(d);
			if(s.equals(s1))
			{
				output=1;
			}
			else
			{
				output=-1;
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return output;
	}
	public static void main(String args[])
	{
		Prog5.fun("29/02/2013");
		System.out.println(output);
	}
	
}
