/*
 * given 2 int array find the sum of common elements
 */


public class Prog24 {
	public static int output;
	public static int fun(int[] arr1, int[] arr2)
	{
		int sum=0;
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					sum=sum+arr1[i];
				}
			}
		}
		output=sum;
		return output;
	}
	public static void main(String args[])
	{
		int[] a1={1,3,5,7,9};
		int[] a2={1,2,3,4,5,6,7,8,9};
		Prog24.fun(a1, a2);
		System.out.println(output);
	}

}
