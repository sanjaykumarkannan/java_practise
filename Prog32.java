/*
 * Input two array lists and a char. If char=’+’ perform union operation.
 *  If char=’*’ perform intersect operation. If char=’-‘perform difference operation.
4.	
 */



import java.util.ArrayList;
import java.util.Scanner;

public class Prog32 {
	public static ArrayList<Integer> output;
	public static ArrayList<Integer> fun(ArrayList<Integer> al1,ArrayList<Integer> al2, char ch )
	{
		if(ch=='+')
		{
			al1.addAll(al2);
			output=al1;
		}
		else if(ch=='*')
		{
			al1.retainAll(al2);
			output=al1;
		}
		else if(ch=='-')
		{
			al1.removeAll(al2);
			output=al1;
		}
		
		return output;
	}
	public static void main(String args[])
	{
		ArrayList<Integer> arr1=new ArrayList<Integer>();
		arr1.add(20);
		arr1.add(10);
		arr1.add(30);
		arr1.add(25);
		arr1.add(21);
		ArrayList<Integer> arr2=new ArrayList<Integer>();
		arr2.add(20);
		arr2.add(10);
		arr2.add(38);
		arr2.add(25);
		arr2.add(24);	
		Prog32.fun(arr1, arr2,'-');
		System.out.println(output);
	}
}
