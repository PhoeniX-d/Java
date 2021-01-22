class Test
{
	public static void main(String[] args)
	{
		String s1 = "durga";;
		String s2 = s1.toString();
		System.out.println(s1 == s2);


		String s3 = s2.toLowerCase();
		String s4 = s1.toUpperCase();
		String s5 = s4.toLowerCase();

		System.out.println(s1 == s3);

	}
}
