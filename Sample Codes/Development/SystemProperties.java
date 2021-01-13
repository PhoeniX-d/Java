import java.util.*;
class SystemProperties
{
	public static void main(String[] args)
	{
		Properties p = System.getProperties();
		p.list(System.out);
	}
}
