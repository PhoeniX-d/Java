import java.util.*;
class NavigableMapDemo
{
	public static void main(String[] args)
	{
		TreeMap<String, String> t = new TreeMap<String, String>();
		t.put("c ", " cat");
		t.put("a ", " apple");
		t.put("b ", " ball");
		t.put("d ", " dog");
		t.put("g ", " gun");

		System.out.println("CielingKey c = " + t.ceilingKey("c"));
		System.out.println("HigherKey e = " + t.higherKey("e"));
		System.out.println("FloorKey e = " + t.floorKey("e"));
		System.out.println("LowerKey e = " + t.lowerKey("e"));
		System.out.println("PollFirstEntry: " + t.pollFirstEntry());
		System.out.println("PollLastEntry: " + t.pollLastEntry());
		System.out.println("Descending Map: " + t.descendingMap());
		System.out.println(t);
	}
}
