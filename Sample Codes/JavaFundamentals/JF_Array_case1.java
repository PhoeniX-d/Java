/* in case of primitive type array as array element we can provide any
type which can be implicitly converted into declared type */

class Test
{
	public static void main(String[] args)
	{
		int[] x = new int[3];
		x[0] = 9;
		short s = 10;
		byte b = 20;
		x[1] = s;
		x[2] = b;
		//x[0] = 10L;
	}
}