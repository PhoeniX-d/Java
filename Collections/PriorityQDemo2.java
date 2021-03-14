import java.util.*;
class PriorityQDemo2 implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		Integer i1 = (Integer)obj1;
		Integer i2 = (Integer)obj2;

		return i2.compareTo(i1);
	}

	public static void main(String[] args)
	{
		PriorityQueue q = new PriorityQueue(new PriorityQDemo());
		for (int i = 0; i <= 10; i++)
		{
			q.offer(i);
		}
		// Here you see that elements are not stored in natural sorting order
		System.out.println(q);
		/*
			but here you see that if we remove elemnts from queue they will get out
			according to cutomized sorting order
		*/
		for (int i = 0; i <= 10; i++)
		{
			System.out.println(q.poll());
		}
		System.out.println(q);
	}
}
