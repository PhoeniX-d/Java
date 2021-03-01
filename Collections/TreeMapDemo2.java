import java.util.*;
class TreeMapDemo2 implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		return obj2.toString().compareTo(obj1.toString());
	}
	public static void main(String[] args)
	{
		TreeMap t = new TreeMap(new TreeMapDemo2());
		t.put("ZZZ", 101);
		t.put("YYY", 120);
		t.put("AAA", 100);
		t.put("UUU", 103);
		t.put("KKK", 106);
		//t.put("FFF", "RRR");
		//t.put(null, "RRR");
		System.out.println(t);		
	}
}
