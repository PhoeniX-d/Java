abstract class P
{
	P(int i)
	{
		System.out.println(this.hashCode());
	}
}

class C extends P
{
	C()
	{
		super(12);
		System.out.println(this.hashCode());
	}
}


public class Test 
{
    public static void main(String args[])   
    {
		/*
        int[] i = new int[3];
        float[] f = new float[2];
        char[] ch = new char[1];
        long[] l = new long[6];
        byte[] b = new byte[2];
        boolean[] z = new boolean[4];
        double[] d = new double[2];
        short[] s = new short[2];
        String str[] = new String[2];

        System.out.println("int\t:" + i.getClass().getName());
        System.out.println("float\t:" + f.getClass().getName());
        System.out.println("long\t:" + l.getClass().getName());
        System.out.println("char\t:" + ch.getClass().getName());
        System.out.println("byte\t:" + b.getClass().getName());
        System.out.println("boolean\t:" + z.getClass().getName());
        System.out.println("double\t:" + d.getClass().getName());
        System.out.println("short\t:" + s.getClass().getName());
        System.out.println("String\t:" + str.getClass().getName());
		*/

	/*
       int x = -4; 
       System.out.println(x>>1);    
       int y = 4; 
       System.out.println(y>>1);    
    */
		C c = new C();
		System.out.println(c.hashCode());
	}
}
