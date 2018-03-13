/*
 * compare two strings, if the characters in string 1 are present in
string 2, then it should be put as such in output, else '+' should be
put in output...ignore case difference.
input 1:"New York"
input 2:"NWYR"
output:N+w+Y+r+ 

Note: Use Character.toLowerCase() to check.. Not Character.isLowerCase.
Don't use unwanted break.

If output is asked to return fully in upper case, use commented stmt below.

 */


public class Prog1 {
	public static String output;
	public static String fun(String s1,String s2)
	{
		int x=0;
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<s1.length();i++)
		{
			for(int j=0;j<s2.length();j++)
			{
				if(Character.toLowerCase(s1.charAt(i))==Character.toLowerCase(s2.charAt(j)))
				{
					sb.append(s1.charAt(i));
					//sb.append(s1.toUpperCase().charAt(i));
								
		
					x=0;
					break;
				}
				else
				{
					x=1;
				}
			}
			if(x==1)
			{
				sb.append("+");
			}
		}
		output=sb.toString();
			return output;
	}
	public static void main(String args[])
	{
		Prog1.fun("New York","NEWYK");
		System.out.println(output);
	}

}
