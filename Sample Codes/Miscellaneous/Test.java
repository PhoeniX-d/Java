interface Interf
{
	int x = 10;
}

class Test implements Interf
{
	int x = 80;
	public static void main(String[] args)
	{
		Test t = new Test();
		System.out.println(t.x);
	}
}
