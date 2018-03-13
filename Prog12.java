/*
 * Number of months between two dates....
 */


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Prog12 {

	/**
	 * @param args
	 */
	public static int output;
	public static int fun(String s1,String s2)
	{
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date d1=sdf.parse(s1);
			Date d2=sdf.parse(s2);
			Calendar c1=Calendar.getInstance();
			Calendar c2=Calendar.getInstance();
			c1.setTime(d1);
			c2.setTime(d2);
			output=Math.abs(c1.get(Calendar.YEAR)-c2.get(Calendar.YEAR)) *12 +
					Math.abs(c1.get(Calendar.MONTH)-c2.get(Calendar.MONTH));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return output;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="04/04/2010";
		String s2="02/06/2012";
		Prog12.fun(s1, s2);
		System.out.println(output);
		

	}

}
