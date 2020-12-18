class StringConcatOperator
{
	public static void main(String[] args)
	{
		String a = "javasoft";
		int b = 10, c = 20, d = 30;

		System.out.println(a + b + c + d);		// javasoft102030
		System.out.println(b + c + a + d);		// 30javasoft2030
		System.out.println(b + c + d + a);		// 60javasoft
		System.out.println(b + a + c + d);		// 10javasoft2030


		//a = b + c + d;	 //Incompatible types : int cannot be converted into String
		a = a + b + c;
		//b = a + c + d;	 //Incompatible types : String cannot be converted into int
		b = b + c + d;

		System.out.println(a);
		System.out.println(b);
	}
}
