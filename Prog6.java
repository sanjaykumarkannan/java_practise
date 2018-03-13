/*
 * ex S1=ajay-pp--
   S2=rama-kk--opuy
   If - symbol is at same index in both the strings then return true... else false...
   
   Patern matching irrespective of the length of string
 */



public class Prog6 {
	public static int output;
	public static int fun(String s1,String s2)
	{
		int x=0;
		int len1=s1.length();
		int len2=s2.length();
		if(len1<len2)
		{
			for(int i=0;i<len1;i++)
			{
				char c1=s1.charAt(i);
				char c2=s2.charAt(i);
				if(c1==c2)
					x=1;
				else if(Character.isLetterOrDigit(c1)&&Character.isLetterOrDigit(c2))
					x=1;
				else
					x=0;
				
			}
			if(x==1)
			{
				output=1;
			}
			else
				output=-1;
		}
		
		
		return output;
	}
	
	public static void main(String args[])
	{
		String s1="hel--oha";
		String s2="hey--ho-a";
		Prog6.fun(s1, s2);
		System.out.println(output);
	}

}
