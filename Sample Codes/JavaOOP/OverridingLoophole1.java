class Parent
{
	public void m1(int... x)
	{
		System.out.println("Parent");
	}
}
class Child extends Parent
{
	public void m1(int x)
	{
		System.out.println("Child");
	}
}

class Test
{
	public static void main(String[] args)
	{
		Parent p = new Parent();
		p.m1(10);

		Child c = new Child();
		c.m1(10);

		p = new Child();
		p.m1(10);

	}
}
