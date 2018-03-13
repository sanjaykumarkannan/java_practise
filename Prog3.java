/*
 *  A string will be given. You need to return a word from the string which has the maximum number of vowels.
 * 
 */


import java.util.ArrayList;
import java.util.StringTokenizer;

public class Prog3 {
	public static String output;
	public static String fun(String s)
	{
		int maxcount=0;
		StringTokenizer st=new StringTokenizer(s," ");
		while(st.hasMoreTokens())
		{
			int count=0;
			String str=st.nextToken();
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' 
						|| str.charAt(i)=='u' || str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I'
						|| str.charAt(i)=='U' || str.charAt(i)=='O')
				{
					count++;
				}
			}
				if(count>=maxcount)
				{
					maxcount=count;
				}
					
			}
		
		
		ArrayList<String> al=new ArrayList<String>();
		StringTokenizer st1=new StringTokenizer(s," ");
		while(st1.hasMoreTokens())
		{
			int count=0;
			String str=st1.nextToken();
			 
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' 
						|| str.charAt(i)=='u' || str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I'
						|| str.charAt(i)=='U' || str.charAt(i)=='O')
				{
					count++;
				}
			}
				if(count==maxcount)
				{
				al.add(str);	
				}
			}
			System.out.println(al);
		
			output=al.get(0).toString();
		return output;
	}
	public static void main(String args[])
	{
		Prog3.fun("This is my java aaaaa eeeee iiiii");
		System.out.println(output);
	}

}
