class Typecast
{
	public static void main(String[] args)
	{
		/* Implicit typecasting */
		/*int x = 'a';
		System.out.println(x);

		double d = 12;
		System.out.println(d);
		*/

		/* Explicit typecasting
		int x = 130;
		byte b1 = (byte)x;
		System.out.println(b1);
		*/

		double d = 130.456;
		int i = (int)d;
		byte b = (byte)d;
		System.out.println(i);
		System.out.println(b);
	}
}