class Parent
{
	public void m1(int... x)
	{
		System.out.println("Parent");
	}
}
class Child extends Parent
{
	public void m1(int... x)
	{
		System.out.println("Child");
	}
}

class Test
{
	public static void main(String[] args)
	{
		/* only var-arg can override another var arg */
		Parent p = new Parent();
		p.m1(10);

		Child c = new Child();
		c.m1(10);

		Parent p1 = new Child();
		p1.m1(10);

	}
}
