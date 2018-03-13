/*
 * The entered string should contain all 5 vowels. If yes return true else return false.
 */



public class Prog22 {
	public static boolean output;
	public static boolean fun(String s)
	{
		int count=0;
		char[] c={'a','e','i','o','u'};
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<c.length;j++)
			{
			char ch=s.charAt(i);
				if(Character.toLowerCase(ch)==c[j])
				{
					count++;
					c[j]='0';
					break;
				}
			}
			
		}
		if(count==5)
		{
			output=true;
		}
		else
			output=false;
		return output;
	}
	public static void main(String args[])
	{
		Prog22.fun("hadejilUo");
		System.out.println(output);
	}

}
