
/*
 * 	int[]={1,2,3,9,10 }
 	finding the max diff bw adjacent numbers= 6 pos=3
 */

public class Prog15 {
public static int output;
public static int fun(int[] arr)
{
	int max=0; 
	int index=0;
	int big_num=0; // Number that contributed for max difference...
	for(int i=0;i<arr.length-1;i++)
	{
		int x=Math.abs(arr[i]-arr[i+1]);
		if(x>max)
		{
			max=x;
			index=i+1;
			if(arr[i]>arr[i+1])
			big_num=arr[i];
			else
			big_num=arr[i+1];
		}
	}
	System.out.println(max);
	System.out.println(index);
	System.out.println(big_num);
	
	return output;
}
public static void main(String args[])
{
	int[] a={1,2,3,9,1,10,16,23,30};
	Prog15.fun(a);
}
}
