

public class Prog11 {
public static String output;
public static String fun(String s1,String s2)
{
	StringBuffer sb=new StringBuffer();
	int x=1;
	for(int i=0;i<s1.length();i++)
	{
		for(int j=0;j<s2.length();j++)
		{
			if(s1.toLowerCase().charAt(i)==s2.toLowerCase().charAt(j))
			{
				sb.append(s1.charAt(i));
				x=0;
				break;
			}
			else
			{
				x=1;
			}
			}
		if(x==1)
		{
			sb.append("+");
		}
	}
	output=sb.toString();
	
	return output;
}
public static void main(String args[])
{
	String s1="New York";
	String s2="New Jersey";
	Prog11.fun(s1, s2);
	System.out.println(output);
}
}
