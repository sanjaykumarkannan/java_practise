/*
 * Remove the vowels from even indices in a string .
 Assume starting index to be 1
 */



public class Prog13 {

	public static String output;
	public static String fun(String s)
	{
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(i%2!=0)
			{
				if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'
						||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'))
				{
					sb.append(ch);
				}
			}
			else
			{
				sb.append(ch);
			}
			output=sb.toString();
			
		}
		
		return output;
	}
	
	public static void main(String args[])
	{
		Prog13.fun("commitment");
		System.out.println(output);
	}


}
