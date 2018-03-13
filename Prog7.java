/*
 * String should contain vowels and the vowels should be in increaing order.....
 */


public class Prog7 {
	public static boolean output;
	public static boolean fun(String s)
	{
		int x=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				int x1=s.charAt(i);
				//System.out.println(s.charAt(i));
				//System.out.println(x1);
				if(x<=x1)
				{
					x=x1;
				}
				else
				{
					x=0;
					break;
				}
			}
		}
		if(x==0)
		{
			output=false;
		}
		else
		{
			output=true;
		}
		
		return output;
	}
	public static void main(String args[])
	{
		Prog7.fun("haaaaaaaall");
		System.out.println(output);
	}

}
