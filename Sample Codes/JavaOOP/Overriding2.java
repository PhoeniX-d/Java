class Parent
{
	public Object m1()
	{
		System.out.println("Object");
	}
}
class Child extends Parent
{
	public String m1()
	{
		System.out.println("String");
	}
}

class Test
{
	public static void main(String[] args)
	{

		/* co-variant retrun types allowed */

		Parent p = new Parent();
		p.m1();

		Child c = new Child();
		c.m1();

		p = new Child();
		p.m1();
	}
}
