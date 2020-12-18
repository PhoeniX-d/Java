class AssignementOp
{
	public static void main(String[] args)
	{
		byte b = 10;
		
		//b = b + 1; 
		/* Compile time error : result type is max(int, type of b, type of 1 
		hence  type of b + 1 becomes int and we cant put int in byte */
		
		b++;		 //result type is b = (type of b)(b + 1); internal compiler is typecasted here
		System.out.println(b);
		
		b += 3;	     //result type is b = (type of b)(b + 3); internal compiler is typecasted here
		System.out.println(b);
	}
}