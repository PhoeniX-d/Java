class VarArg
{
	public static void m1(int... x)
	{
		System.out.print("Parameters passed to Var-Arg m1 are:\t");
		for(int i : x)
		{
			System.out.print(i + " ");
		}
		System.out.println();
	}
	public static void main(String... args)
	{
		for(String s : args)
		{
			System.out.println(s);
		}

		m1(10);
		m1(10, 203);
		int[] arr = new int[]{1, 3, 4, 56};
		m1(arr);
	}
}
