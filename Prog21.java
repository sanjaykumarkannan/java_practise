/*
 * retrieve the no of occurrence of 2nd word from string 2  in  string 1.
 */



import java.util.ArrayList;
import java.util.StringTokenizer;

public class Prog21 {
public static int output;
public static int fun(String s1,String s2)
{
	ArrayList<String> al=new ArrayList<String>();
	ArrayList<String> al1=new ArrayList<String>();

	int count=0;
	StringTokenizer st=new StringTokenizer(s2," ");
	while(st.hasMoreElements())
	{
		al.add(st.nextToken());
	}
	System.out.println(al);
	System.out.println(al.get(1));
	String str1=al.get(1);
	StringTokenizer st1=new StringTokenizer(s1," ");
	while(st1.hasMoreElements())
	{
		al1.add(st1.nextToken());
	}
	for(int i=0;i<al1.size();i++)
	{
		if(al1.get(i).equals(str1))
		{
			count++;
		}
	}
System.out.println(al1);
	output=count;
	return output;
}
public static void main(String args[])
{
	String s1="hi this is java prog this using this input";
	String s2="See this program";
	Prog21.fun(s1, s2);
	System.out.println(output);
}
}
