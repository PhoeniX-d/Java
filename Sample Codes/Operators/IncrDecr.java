class IncrDecr
{
	public static void main(String args[])
	{
		/*
		example 1:
		int i = 10;
		int j = ++(++i);
		System.out.println(j);
		*/

		/* 
		example 2:
		int x = 10;
		char ch = 'a';
		double d = 10.5;
		boolean b = true;

		x++;
		ch++;
		d++;
		//b++;

		System.out.println(x);
		System.out.println(ch);
		System.out.println(d);
		System.out.println(b);
		*/

		/*
		example 3:
		byte a = 10, b = 20;
		byte c = a + b;//type of result should be => max(int, type of a, type of b) for any arithmatic operators
		System.out.println(c)
		*/

		/*
		example 4:
		byte a = 10;
		a++;		// here for ++ internally result will be => (type of a)(a + 1)
		System.out.println(a);
		*/

		/*
		example 5:
		System.out.println('a' + 'b');
		System.out.println('a' + 10.7);
		*/

		/*
		example 6:
		System.out.println(10 / 0);				// RE : AE / by zero
		System.out.println(10 / 0.0);			// Infinity => Double.POSITIVE_INFINITY
		System.out.println(0 / 0);				// RE : AE / by zero
		System.out.println(0 / 0.0);			// NaN => Double.NaN
		System.out.println(-1.0 /0.0);			// -Infinity => Double.NEGATIVE_INFINITY
		System.out.println(-0 / 0.0);			// NaN => Double.NaN
		System.out.println(0.0 / 0);			// NaN => Double.NaN
		System.out.println(-0.0 / 0);			// NaN => Double.NaN
		*/

		/*
		example 7:
		System.out.println(10 > Double.NaN);
		System.out.println(10 >= Double.NaN);
		System.out.println(10 < Double.NaN);
		System.out.println(10 <= Double.NaN);
		System.out.println(10 == Double.NaN);
		System.out.println(10 != Double.NaN);
		System.out.println(Double.NaN != Double.NaN);
		*/
	}
}
