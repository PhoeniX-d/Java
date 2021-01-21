import static java.lang.System.out;

class Animal
{
}
class Monkey extends Animal
{ 
}
class Test
{
	public void m1(Animal a)
	{
		out.println("Animal a");
	}

	public void m1(Monkey a)
	{
		out.println("Monkey m");
	}

	public static void main(String[] args)
	{
		/* Method resoultion at compile time by compiler based on reference type in overloading */
		Test t = new Test();
		Animal a = new Animal();
		t.m1(a);

		Monkey m = new Monkey();
		t.m1(m);

		Animal a1 = new Monkey();
		t.m1(a1);
	}
}
