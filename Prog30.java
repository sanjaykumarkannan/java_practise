/*
 *
check whether the given string is only a positive num. 
if it is neg num, return the abs of it. else return -1
  
 */


public class Prog30 {
public static int output;
public static int fun(String s)
{
	Integer io=new Integer(s);
	for(int i=1;i<s.length();i++)
	{
		if(s.charAt(0)!='-')
		{
		if(Character.isDigit(s.charAt(i)))
				{				
				output=io.intValue();
				}
		else if(Character.isLetter(s.charAt(i)))
		{
			output=-1;
		}
		}
		else if(s.charAt(0)=='-')	
		{
			if(Character.isDigit(s.charAt(i))){
			output=Math.abs(io.intValue());
				}
		else if(Character.isLetter(s.charAt(i)))
		{
			output=-1;
		}
	}
		else if(Character.isLetter(s.charAt(i)))
		{
			output=-1;
		}
	}
	return output;
}
public static void main(String args[])
{
	Prog30.fun("-3456");
	System.out.println(output);
}
}
