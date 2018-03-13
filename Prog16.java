/*
 *  given: int[] array
  find the difference b/w max n min value			
 */


import java.util.ArrayList;
import java.util.Collections;

public class Prog16 {
	public static int output;
	public static int fun(int[] arr)
	{
	 ArrayList<Integer> al=new ArrayList<Integer>();
	 for(int i=0;i<arr.length;i++)
	 {
		 al.add(arr[i]);
	 }
	 Collections.sort(al);
	 output=al.get(al.size()-1)-al.get(0);
		
		
		return output;
	}
	public static void main(String args[])
	{
		int[] a={2,4,6,8,22};
		Prog16.fun(a);
		System.out.println(output);
	}
}
