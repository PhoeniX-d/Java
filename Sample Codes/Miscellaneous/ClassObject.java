import java.lang.reflect.*;

class Student
{
	public String getName()
	{
		return null;
	}

	public int getMarks()
	{
		return 89;
	}
}

class ClassObject
{
	public static void main(String[] args) throws Exception
	{
		/*
		int iCnt = 0;
		Class c = Class.forName("Student");
		Method[] m = c.getDeclaredMethods();
		System.out.println("Total methods are:\t" + m.length);
		for(Method m1 : m)
		{
			System.out.println(m1.getName());
		}
		*/

		Student s1 = new Student();
		Class c1 = s1.getClass();
		Student s2 = new Student();
		Class c2 = s2.getClass();

		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1 == c2);
	}
}
