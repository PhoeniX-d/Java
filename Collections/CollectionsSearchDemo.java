import java.util.*;
class CollectionsDemo
{
	public static void main(String[] args)
	{
		ArrayList<String> l = new ArrayList<String>();
		l.add("Z");
		l.add("L");
		l.add("A");
		l.add("B");
		l.add("N");

		System.out.println(l);
		Collections.sort(l);
		System.out.println("After Sorting = " + l);
		System.out.println(Collections.binarySearch(l, "L"));
	}
}
