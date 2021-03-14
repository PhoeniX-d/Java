import java.util.*;
class ArraysDemo2 implements Comparator
{ 
	public int compare(Object obj1, Object obj2)
	{
		return obj2.toString().compareTo(obj1.toString());
	}

	public static void main(String[] args)
	{
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
		System.out.println(Arrays.binarySearch(a, 6));
		System.out.println(Arrays.binarySearch(a, 14));
	
		String[] sc = {"X", "F", "Q", "A"};
		System.out.println("Before Sorting []s");
		for(String s1 : sc)
		{
			System.out.print(s1 + " ");
		}
		System.out.println();
		Arrays.sort(sc, new ArraysDemo2());
		System.out.println("After Sorting []s");
		for(String s1 : sc)
		{
			System.out.print(s1 + " ");
		}
		System.out.println();
		System.out.println(Arrays.binarySearch(sc, "X", new ArraysDemo2()));
		System.out.println(Arrays.binarySearch(sc, "S", new ArraysDemo2()));
		System.out.println(Arrays.binarySearch(sc, "N"));
	}
}
