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
		String s1 = new String("Ken");
		String s2 = new String("Ken");

		StringBuffer s3 = new StringBuffer("Ben");
		StringBuffer s4 = new StringBuffer("Ben");

		System.out.println(s1 == s2);		 
		System.out.println(s1.equals(s2));

		System.out.println(s3 == s4);		
		System.out.println(s3.equals(s4));
	}
}
