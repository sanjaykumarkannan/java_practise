/*Check if the string is valid or not. String should contain at least 8 characters,
 *  should not start with number or special char, should not end with special 
char, should contain either @ or # or _.
 * 
 */

public class Prog31 {
public static boolean output;
public static boolean fun(String s)
{
	if((s.length()>=8) && (Character.isLetter(s.charAt(0))) &&
			(Character.isLetterOrDigit(s.charAt(s.length()-1))))
	{
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='@' || s.charAt(i)=='#' || s.charAt(i)=='_' ) 
			{
			output=true;
		}
		}
	}
	else
	{
		output=false;
	}
	
	return output;
}
public static void main(String args[])
{
	Prog31.fun("a_qw55");
	System.out.println(output);
}
}
