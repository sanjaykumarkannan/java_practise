/*
 * find the avg of values in hashMAp
 where key is odd
 */



import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Prog17 {
	public static int output;
	public static int fun(HashMap<Integer,Integer> input)
	{
		int sum=0;
		int avg=0;
		int count=0;
		Set<Integer> s=input.keySet();
		Iterator<Integer> ite=s.iterator();
		while(ite.hasNext())
		{
		
			Object obj=ite.next();
			Object obj1=input.get(obj);
			Integer io=(Integer)obj;
			Integer io1=(Integer)obj1;
			int id=io.intValue();
			int mark=io1.intValue();
			if(id%2!=0)
			{
				sum=sum+mark;
				count++;
			}
			
		}
		System.out.println(sum);
		System.out.println(count);
		avg=sum/count;
		output=avg;	
		
			
		return output;
	}
public static void main(String args[])
{
	HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
	hm.put(1,80);
	hm.put(2,85);
	hm.put(3,90);
	hm.put(4,90);
	Prog17.fun(hm);
	System.out.println(output);
}
}
