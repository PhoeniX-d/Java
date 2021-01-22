class Test
{
	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer(1000);
		System.out.println(sb.capacity());
		sb.append(333);
		sb.trimToSize();
		System.out.println(sb.capacity());

	}
}
