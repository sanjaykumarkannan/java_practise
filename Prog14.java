
//3 strings are given as input. We need to check whether second string 
//occurs first in String 1 or third string occurs first in string 1.


public class Prog14 {
	public static boolean output;
	public static boolean fun(String s,String s1,String s2)
	{
		int x=s.indexOf(s1);
		int y=s.indexOf(s2);
		if(x<y)
		{
			output=true;
		}
		else
		{
			output=false;
		}
		return output;
	}
	public static void main(String args[])
	{
		Prog14.fun("geniousramharidev","ram","dev");
		System.out.println(output);
	}

}