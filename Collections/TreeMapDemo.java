import java.util.*;
class TreeMapDemo
{
	public static void main(String[] args)
	{
		TreeMap t = new TreeMap();
		t.put(100, "ZZZ");
		t.put(103, "YYY");
		t.put(102, "AAA");
		t.put(101, "UUU");
		t.put(105, 106);
		//t.put("FFF", "RRR");
		//t.put(null, "RRR");
		System.out.println(t);
		
	}
}
