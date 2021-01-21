class Student
{
	String name;
	int rollno;

	Student(String name, int rollno)
	{
		this.name = name;
		this.rollno = rollno;
	}

	public int hashCode()
	{
		return this.rollno;
	}

	public static void main(String[] args)
	{
		Student s1 = new Student("Ken", 100);
		Student s2 = new Student("Ben", 102);

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
