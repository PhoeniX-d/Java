class Student
{
	String name;
	int rollno;

	Student(String name, int rollno)
	{
		this.name = name;
		this.rollno = rollno;
	}
	
	public boolean equals(Object o)
	{
		if(this == o)
		{
			return true;
		}
		if(o instanceof Student)
		{
			Student s = (Student)o;
			if(this.name.equals(s.name) && this.rollno == s.rollno)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		return false;
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
		System.out.println(s1.equals("Ken"));
		System.out.println(s1.equals(null));
	}
}
