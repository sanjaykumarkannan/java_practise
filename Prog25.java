/*
 * 2 arraylist of same length containing int create a new arraylist which wil have even elements from 2nd arraylist and odd from first arraylist
ex:ar1={2,4,6,5,8}
  ar2={8,1,10,3,7} op=8,4,10,5,7
 */



public class Prog25 {
public static int[] output;
public static int[] fun(int[] arr1, int[] arr2)
{
	output=new int[arr1.length];
	for(int i=0;i<arr1.length;i=i+2)
	{
			output[i]=arr2[i];
	}
	for(int i=1;i<arr1.length;i=i+2)
	{
			output[i]=arr1[i];
	}
	
	return output;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a1={2,4,6,5,8};
int[] a2={8,1,10,3,7};
Prog25.fun(a1, a2);
for(int i=0;i<output.length;i++)
{
System.out.println(output[i]);
}
}
}
