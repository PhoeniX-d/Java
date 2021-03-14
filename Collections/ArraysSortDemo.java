import java.util.*;
class ArraysDemo implements Comparator
{ 
	public int compare(Object obj1, Object obj2)
	{
		return obj2.toString().compareTo(obj1.toString());
	}

	public static void main(String[] args)
	{
		// Primitive array sorting
		int[] a = {10, 5, 19, 11, 6};
		System.out.println("Before Sorting []a");
		for(int a1 : a)
		{
			System.out.print(a1 + " ");
		}
		System.out.println();
		Arrays.sort(a);
		System.out.println("After Sorting []a");
		for(int a1 : a)
		{
			System.out.print(a1 + " ");
		}
		System.out.println();
	
		// Object array sorting
		String[] s = {"X", "F", "Q", "A"};
		System.out.println("Before Sorting []s");
		for(String s1 : s)
		{
			System.out.print(s1 + " ");
		}
		System.out.println();
		Arrays.sort(s);
		System.out.println("After Sorting []s");
		for(String s1 : s)
		{
			System.out.print(s1 + " ");
		}
		System.out.println();

		// Object array sorting using Comparator
		String[] sc = {"X", "F", "Q", "A"};
		System.out.println("Before Sorting []s");
		for(String s1 : sc)
		{
			System.out.print(s1 + " ");
		}
		System.out.println();
		Arrays.sort(sc, new ArraysDemo());
		System.out.println("After Sorting []s");
		for(String s1 : sc)
		{
			System.out.print(s1 + " ");
		}
		System.out.println();
	}
}
