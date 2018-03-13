/*
 * find the max length-word in a given string and return the max-length word. if two words are of same length return the first occuring word
input:"hello how are you aaaaa"
output:hello
 */



import java.util.StringTokenizer;

public class Prog29 {
public static String output;
public static String fun(String s)
{
	String str="";
	int max=0;
	StringTokenizer st=new StringTokenizer(s," ");
	while(st.hasMoreTokens())
	{
		String s1=st.nextToken();
		if(s1.length()>max)
		{
			max=s1.length();
			str=s1;
		}
	}
	output=str;
	return output;
}
public static void main(String args[])
{
	Prog29.fun("hello how are you aaaaa");
	System.out.println(output);
}
}
