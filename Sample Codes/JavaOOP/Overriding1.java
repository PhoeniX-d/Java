class Parent
{
	public void property()
	{
		System.out.println("cash|land|gold");
	}
	public void bussiness()
	{
		System.out.println("family bussiness");
	}
}
class Child extends Parent
{
	public void bussiness()
	{
		System.out.println("own bussiness");
	}
}

class Test
{
	public static void main(String[] args)
	{

		/* Method resoultion at runtime time by jvm based on runtime object type in overriding */

		Parent p = new Parent();
		p.bussiness();

		Child c = new Child();
		c.bussiness();

		p = new Child();
		p.bussiness();
	}
}
