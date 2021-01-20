import static java.lang.System.out;

class Test
{
	public static void m1(int x, float y)
	{
		System.out.println("int-float-arg");
	}

	public static void m1(float a, int b)
	{
		System.out.println("float-int-arg");
	}

	public static void main(String[] args)
	{
		m1(10, 20.8f);
		m1(20.7f, 12);
		//m1(10, 10);
		//m1(1.1f, 3.4f);
	}
}
