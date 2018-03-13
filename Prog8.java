/*
 * 1+3-5+7-9=-3
 * 
 */


public class Prog8 {

	/**
	 * @param args
	 */
	public static int output;
	public static int fun(int n)
	{
		int sum=0;
		for(int i=3;i<=n;i=i+4)
		{
			sum=sum+i;
		}

		for(int i=5;i<=n;i=i+4)
		{
			sum=sum-i;
		}
		sum=sum+1;
		output=sum;
		
		return output;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prog8.fun(10);
		System.out.println(output);
	}

}
