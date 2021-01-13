class ClassLoaderExample
{
	public static void main(String[] args)
	{
		System.out.println("Class Loader of String class:\t" + String.class.getClassLoader());
		System.out.println("Class Loader of ClassLoaderExample class:\t" + ClassLoaderExample.class.getClassLoader());
		System.out.println("Class Loader of Student class:\t" + Student.class.getClassLoader());
	}
}
