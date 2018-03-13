/*
 * 23462533
sum of odd digits in string
3+5+3+3
if(sum)==even
return -1
else
1
 * 
 */


public class Prog19 {
	public static int output;
	public static int fun(int[] arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				sum=sum+arr[i];
			}
		}
		if(sum%2==0)
			output=-1;
		else
			output=1;
		System.out.println(sum);
		return output;
	}
	public static void main(String args[])
	{
		int[] a={2,3,4,5,6,11,4,7};
		Prog19.fun(a);
		System.out.println(output);
	}
}
