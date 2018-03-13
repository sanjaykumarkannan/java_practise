/*
 * matches a pattern 'CTS-XXX' where XXX is a three digit number
 */


public class Prog35 {

	public static boolean output;
	public static boolean fun(String s)
	{
		
		if((s.startsWith("CTS-"))&&(s.length()==7))
		{
			for(int i=4;i<s.length();i++)
			{
				if(Character.isDigit(s.charAt(i)))
						{
							output=true;
						}
				else
				{
					output=false;
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
		Prog35.fun("CTS-619");
		System.out.println(output);
	}
}
