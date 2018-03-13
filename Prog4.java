/*
 * To find whether the given year is leap year or not...
 */



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Prog4 {
	public static boolean output;
	public static boolean fun(String s)
	{
		StringBuffer sb=new StringBuffer();
		sb.append("02/");
		sb.append(s);
		String s1=sb.toString();
		SimpleDateFormat sdf=new SimpleDateFormat("MM/yyyy");
		try {
			Date d=sdf.parse(s1);
			Calendar c=Calendar.getInstance();
			c.setTime(d);
			if(c.getActualMaximum(Calendar.DAY_OF_MONTH)==29)
					{
						output=true;
					}
			else
			{
				output=false;
			}
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return output;
	}
	public static void main(String args[])
	{
		Prog4.fun("2020");
		System.out.println(output);
	}

}
