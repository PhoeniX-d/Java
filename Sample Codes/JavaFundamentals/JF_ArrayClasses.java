class Test 
{
	public static void main(String[] args) 
	{
		boolean[] b = new boolean[2];
		char c[] = new char[2];
		short[] s = new short[2];
		int[] i = new int[2];
		long[] l = new long[2];
		float[] f = new float[2];
		double[] d = new double[2];
		String ss[] = new String[3];

		System.out.println(b.getClass().getName());
		System.out.println(c.getClass().getName());
		System.out.println(s.getClass().getName());
		System.out.println(i.getClass().getName());
		System.out.println(l.getClass().getName());
		System.out.println(f.getClass().getName());
		System.out.println(d.getClass().getName());
		System.out.println(ss.getClass().getName());
	}
}
