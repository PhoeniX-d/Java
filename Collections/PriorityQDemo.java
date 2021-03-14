import java.util.*;
class PriorityQDemo
{
	public static void main(String[] args)
	{
		PriorityQueue q = new PriorityQueue();
		System.out.println(q.peek());
		//System.out.println(q.element());
		for (int i = 0; i <= 10; i++)
		{
			q.offer(i);
		}
		// Here you see that elements are not stored in natural sorting order
		System.out.println(q);
		/*
			But here you see that if we remove elemnts from queue they will get removed
			according to natural sorting order,afterall in queue removal is important
		*/
		for (int i = 0; i <= 10; i++)
		{
			System.out.println(q.poll());
		}
		System.out.println(q);
	}
}
