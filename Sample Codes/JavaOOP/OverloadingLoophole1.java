import static java.lang.System.out;

class Test
{
	public static void m1(int x)
	{
		System.out.println("int-arg");
	}

	public static void m1(float a)
	{
		System.out.println("float-arg");
	}

	public static void main(String[] args)
	{
		m1(10);
		m1(20.7f);			
		m1(10L);		// Automatic arg type promotion
		m1('a');		// Automatic arg type promotion
		//m1(1.1);		// no matched method found even after automatic arg type promotion
	}
}
