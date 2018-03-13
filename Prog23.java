/*
 * Greatest Span in an array...
 */



public class Prog23 {
	public static int output;
	public static int fun(int[] arr)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				int x=i;
				int y=0;
				int z=0;
				if(arr[i]==arr[j])
				{
					y=j;
				}
				z=(y-x)+1;
				if(z>count)
				{
					count=z;
				}
			}
		}
		output=count;
		return output;
	}
	public static void main(String args[])
	{
		int[] a={1,2,3,4,5,1,7,7,7,5,4,2};
		Prog23.fun(a);
		System.out.println(output);
	}

}
