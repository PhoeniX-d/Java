import java.util.*;
class CollectionsDemo2 implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		return obj2.toString().compareTo(obj1.toString());
	}

	public static void main(String[] args)
	{
		ArrayList<String> l = new ArrayList<String>();
		l.add("Z");
		l.add("L");
		l.add("A");
		l.add("B");
		l.add("N");

		System.out.println(l);
		Collections.sort(l, new CollectionsDemo2());
		System.out.println("After Sorting = " + l);
		System.out.println(Collections.binarySearch(l, "L",  new CollectionsDemo2()));
		System.out.println(Collections.binarySearch(l, "A",  new CollectionsDemo2()));
		System.out.println(Collections.binarySearch(l, "A"));
	}
}
