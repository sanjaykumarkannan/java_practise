/*
 * Two dates are given as input in "yyyy-MM-dd" format. Find the number of days between the two dates
input1:"2012-12-01"
input2:"2012-12-03"
 */



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Prog28 {
	public static int output;
	public static int fun(String s1, String s2)
	{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
		try {
			Date d=sdf.parse(s1);
			Date d1=sdf.parse(s2);
			Calendar c=Calendar.getInstance();
			c.setTime(d);
			Calendar c1=Calendar.getInstance();
			c1.setTime(d1);
			long x=c.getTimeInMillis()/(24*60*60*1000);
			long y=c1.getTimeInMillis()/(24*60*60*1000);
			long z=Math.abs(x-y);
			output=(int)z;
		
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return output;
	}
	public static void main(String args[])
	{
		String s1="2011/11/15";
		String s2="2012/11/10";
		Prog28.fun(s1, s2);
		System.out.println(output);
	}

}
