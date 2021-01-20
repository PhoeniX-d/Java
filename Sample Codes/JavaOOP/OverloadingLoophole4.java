import static java.lang.System.out;

class Test
{
	public static void m1(int x)
	{
		System.out.println("int-arg");
	}

	public static void m1(int ...x)
	{
		System.out.println("var-arg");
	}

	public static void main(String[] args)
	{
		m1(10, 20);
		m1();
		m1(100);
	}
}
