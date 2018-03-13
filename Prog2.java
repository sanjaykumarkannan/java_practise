/*
 * Time is entered as hh:mm am or pm format. If time is valid it should return 1 else return -1. 
 * Ignore whether am or pm is in upper case or lower case. 
 * 
 * Note: if am and pm entered has to be case sensitive then use s1.equals("am") instead of s1.equalsIgnoreCase("am").
 */



import java.util.StringTokenizer;

public class Prog2 {
	public static int output;
	
	public static int fun(String s)
	{
		StringTokenizer st=new StringTokenizer(s,": ");
		while(st.hasMoreTokens())
		{
			int h=Integer.parseInt(st.nextToken());
			int m=Integer.parseInt(st.nextToken());
			String s1=st.nextToken();
			if((h>0&&h<=12) && (m>0&&m<=59) && (s1.equalsIgnoreCase("am")|| (s1.equalsIgnoreCase("pm"))))
			{
				output=1;
			}
			else
			{
				output=-1;
			}
			}	
		
		return output;
	}

	public static void main(String args[])
	{
		Prog2.fun("02:06 aM");
		System.out.println(output);
	}

}
