//It should contain only numbers, if any string contains characters return no...


public class Prog10 {
public static boolean output;
public static boolean fun(String[] s)
{
	StringBuffer sb=new StringBuffer();
	for(int i=0;i<s.length;i++)
	{
		sb.append(s[i]);
	}
	System.out.println(sb);
	for(int i=0;i<sb.length();i++)
	{
		char ch=sb.charAt(i);
		if(Character.isDigit(ch))
		{
			output=true;
		}
		else
		{
			output=false;
			break;
		}
		
	}
	return output;
}
public static void main(String args[])
{
	String[] str={"123","345","67"};
	Prog10.fun(str);
	System.out.println(output);
}
}