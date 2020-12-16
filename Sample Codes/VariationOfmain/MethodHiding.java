class MethodHiding
{
	public static void main(String... args)
	{
		System.out.println("Parent main()");
	}
}

class Childmain extends MethodHiding
{
	public static void main(String... args)		/* Not overriding : its method hiding */
	{
		System.out.println("Child main()");
	}
}
