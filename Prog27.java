/*
 * ip=[2,10,20,10,2,3]
  op=[2,20,2,3,0,0]
  q=remove 10 where it is then insert 0's at last to make both intger array length equal;
 */



import java.util.ArrayList;

public class Prog27 {
	public static int[] output;
	public static int[] fun(int[] input)
	{
		output=new int[input.length];
		int x=10;
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<input.length;i++)
		{
			if(input[i]!=10)
			{
				al.add(input[i]);
			}
			
		}
		System.out.println(al);
		for(int i=0;i<al.size();i++)
		{
			output[i]=al.get(i);
		}
		return output;
	}
	public static void main(String args[])
	{
		int[] a={2,10,20,10,6,10};
		Prog27.fun(a);
		for(int i=0;i<output.length;i++)
		{
			System.out.print(output[i]+ " ");
		}
	}

}
