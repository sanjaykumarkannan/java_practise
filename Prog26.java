/*
 * ip=[2,4,8,5,1] 
    a.lenth should be odd
    b.take middle number and last number if print max of two;
    c.if there is 1 element print that element and it's index;
 */


public class Prog26 {
	public static boolean output1;
	public static int output2;
	public static int output3;
	public static int fun(int[] arr)
	{
		if(arr.length%2!=0)
		{
			output1=true;
			int x=(arr.length/2)+1;
			int y=arr.length-1;
			if(arr[x]>arr[y])
			{
				output2=arr[x];
			}
			else
			{
				output2=arr[y];
			}
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]==1)
				{
					output3=i;
				}
			}
		}
		else
		{
			output1=false;
		}
		
		return output2;
	}
	public static void main(String args[])
	{
		int[] a={2,1,8,4,6,7,9};
		Prog26.fun(a);
		System.out.println("Length is odd:"+output1);
		System.out.println("Max of 2 is:"+output2);
		System.out.println("Index of 1:"+output3);
	}
	
	
}
