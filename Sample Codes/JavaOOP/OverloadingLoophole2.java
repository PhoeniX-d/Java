import static java.lang.System.out;

class Test
{
	/*public static void m1(short x)
	{
		System.out.println("short-arg");
	}

	public static void m1(int b)
	{
		System.out.println("int-arg");
	}

	public static void main(String[] args)
	{
		m1(12);
		short s = 900;
		m1(s);
		m1((short)23);
		m1('a');
	}*/

	public static void m1(String x)
	{
		System.out.println("String-arg");
	}

	public static void m1(Object b)
	{
		System.out.println("Object-arg");
	}

	public static void main(String[] args)
	{
		m1(null); // Child gets precedence here
	}
}


/* 
	byte => short 
			  ||
			  \/
		   	  int => long => float => double
			  /\
			  ||
			  char
*/