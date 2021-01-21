class Student
{
	String name;
	int rollno;

	Student(String name, int rollno)
	{
		this.name = name;
		this.rollno = rollno;
	}

	public static void main(String[] args)
	{
		Student s1 = new Student("Ken", 100);
		Student s2 = new Student("Ben", 102);
		Student s3 = new Student("Ken", 100);
		Student s4 = s1;

		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
	}
}
