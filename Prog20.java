/*
 * 
 *given inout1 as string and input2 as integer 
Calfornia,3 so u have to get the first input2 no of characters and last input2 no of characters and concate this two
result: Calnia
 */


public class Prog20 {
	public static String output;
	public static String fun(String input, int n)
	{
		String s1=input.substring(0,n);
		StringBuffer sb=new StringBuffer();
		StringBuffer sb1=new StringBuffer();
		sb.append(input);
		sb.reverse();
		String s2=sb.substring(0, n);
		sb1.append(s2);
		output=s1+sb1.reverse().toString();
		return output;
	}
	public static void main(String args[])
	{
		Prog20.fun("CaliforNia", 3);
		System.out.println(output);
	}

}
