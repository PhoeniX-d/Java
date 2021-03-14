import java.util.*;
class NavigableSetDemo
{
	public static void main(String[] args)
	{
		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(3000);
		t.add(5000);
		t.add(2000);
		t.add(7000);
		t.add(4000);
		t.add(6000);

		System.out.println("Cieling = " + t.ceiling(2000));
		System.out.println("Higher = " + t.higher(3000));
		System.out.println("Floor = " + t.floor(4000));
		System.out.println("Lower = " + t.lower(3000));
		System.out.println("PollFirst = " + t.pollFirst());
		System.out.println("PollLast = " + t.pollLast());
		System.out.println("Descending Set = " + t.descendingSet());
		System.out.println(t);
	}
}
