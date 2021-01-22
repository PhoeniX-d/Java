import java.lang.reflect.*;
class Test
{
	public static void main(String[] args)
	{
		int count = 0;
		Object o = new String("Hello");
		Class c = o.getClass();

		System.out.println(c.getName());
		Method[] m = c.getDeclaredMethods();
		System.out.println("Methods are");

		for(Method m1 : m)
		{
			count++;
			System.out.println(m1.getName());
		}
		System.out.println("Total " + count + " methods are declared");
	}
}
