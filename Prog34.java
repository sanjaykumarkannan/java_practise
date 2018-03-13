/*
 * first and lst character of a string should be same
 */


public class Prog34 {
	public static boolean output;
	public static boolean fun(String s)
	{
		if(s.charAt(0)==s.charAt(s.length()-1))
		{
			output=true;
		}
		else
		{
			output=false;
		}
		return output;
	}
	public static void main(String args[])
	{
		Prog34.fun("hello");
		System.out.println(output);
	}

}
