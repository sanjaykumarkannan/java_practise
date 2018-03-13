/*
 * sum of numbers other than prime up to a given input
 */

public class Prog37 {
	public static int output;
	public static int fun(int n)
	{
		int sum=0;
		for(int i=2;i<n;i++)
		{
			int flag=1;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
				flag=0;	
				}
				
			}
			if(flag==0)
			{
				System.out.println(i);
				sum=sum+i;
			}
			
		}
		output=sum;
		return output;
	}
	public static void main(String args[])
	{
		Prog37.fun(10);
		System.out.println(output);
	}

}
