/*
// for newInstance() demo
class Student
{
}

class Customer
{
}
*/

class FlowControls
{
	public FlowControls()
	{
		
	}
	public static void main(String[] args)throws Exception
	{
		/* Demonstration of new operator */
		/*
		FlowControls fc = new FlowControls();
		System.out.println("Object of FlowControl \'fc\' created using \'new\' operator: " + fc.getClass().getName());
		*/
		
		/* Demonstration of newInstance() */
		/*
		Object o = Class.forName(args[0]).newInstance();
		System.out.println("Object of \'o\' created using \'newInstance()\' method of class: " + o.getClass().getName());
		*/
			
		/* instanceof demonstration */
		/*
		Thread t = new Thread();
		System.out.println("t instanceof Thread :\t" + (t instanceof Thread));
		System.out.println("t instanceof Object :\t" + (t instanceof Object));
		System.out.println("t instanceof Runnable :\t" + (t instanceof Runnable));
	    //System.out.println("t instanceof String :\t" + (t instanceof String));
		*/

		/* isInstance() demonstration */
		/*
		Thread t = new Thread();
		System.out.println(Class.forName(args[0]).isInstance(t));
		*/

		/* Flow-Control demonstration */
		// if - else
		// 1. Only boolean argument required
		/*
		boolean b = true;
		if(b = false)
		{
			System.out.println("Hello");
		}
		else
		{
			System.out.println("Hi");
		}
		*/
		
		// 2. without {} only 1 stmt is allowed which shouldn't be declarative
		/*
		if(true)
			int v = 10;	// Error
		*/
	
		// 3. dangling else mapped to nearest if
		/*
		if(true)
			if(x == 10)
				System.out.println("Hi");
		else
			System.out.println("Hello");
		*/

		/* switch stmt */
		/*
		switch(Integer.parseInt(args[0]))
		{
			default : System.out.println("default");
			case 0 : System.out.println("0");
					 break;
			case 1 : System.out.println("1");

			case 2 : System.out.println("2");			
		}

		*/

		/* while loop */
		// some unreachable stmt errors:
		// 1
		/*
		while(true)
		{
			System.out.println("Hello");
		}
		System.out.println("Hi");		// unreachable stmt
		*/

		// 2
		/*
		while(false)
		{					// unreachable stmt
			System.out.println("Hello");
		}
		System.out.println("Hi");
		*/

		// 3
		/*
		int a = 10, b = 20;
		while(a < b)
		{
			System.out.println("Hello"); // infinite times Hello....
		}
		System.out.println("Hi");
		*/
		
		//4
		/*
		int a = 10, b = 20;
		while(a > b)
		{
			System.out.println("Hello");
		}
		System.out.println("Hi");	// Hi 
		*/

		// 5
		/*
		final int a = 10, b = 20;
		while(a < b)
		{
			System.out.println("Hello");	
		}
		System.out.println("Hi");	// unreachable stmt
		*/

		//6
		/*
		final int a = 10, b = 20;
		while(a > b)
		{			// unreachable stmt
			System.out.println("Hello"); 
		}
		System.out.println("Hi");
		*/

		/* Compile replaces all compile time constants with values at compile time only */
	}
}