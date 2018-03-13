/*
 * return 1 if date matches pattern(dd.MM.yyyy  ,  dd/MM/yy,  dd-MM-yyyy)
 */


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Prog33 {
	public static int output;
	public static int fun(String s)
	{
		if((s.charAt(1)=='/') || (s.charAt(2)=='/'))
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
					output=-1;
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				output=-1;
			//	e.printStackTrace();
			}
		}
		else if((s.charAt(1)=='.') || (s.charAt(2)=='.'))
		{
			SimpleDateFormat sdf=new SimpleDateFormat("dd.MM.yyyy");
			try {
				Date d=sdf.parse(s);
				String s1=sdf.format(d);
				if(s.equals(s1))
				{
					output=1;
				}
				else
					output=-1;
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				output=-1;
			//	e.printStackTrace();
			}
		}
		else if((s.charAt(1)=='-') || (s.charAt(2)=='-'))
		{
			SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
			try {
				Date d=sdf.parse(s);
				String s1=sdf.format(d);
				if(s.equals(s1))
				{
					output=1;
				}
				else
					output=-1;
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				output=-1;
				//e.printStackTrace();
			}
		}
		else
		{
			output=-1;
		}
		return output;
	}
	public static void main(String args[])
	{
		Prog33.fun("02-11-2012");
	System.out.println(output);
	}

}
