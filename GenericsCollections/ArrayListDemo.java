import java.io.Serializable;
import java.util.*;
class ArrayListDemo
{
    public static void main(String[] args)
    {
        ArrayList<Character> l = new ArrayList<Character>();
        l.add('A');
        l.add('A');
        l.add(null);
        System.out.println(l);
        System.out.println(l.set(2, 'B'));
        System.out.println(l);
        l.add(2, 'M');
        l.add('N');
        System.out.println(l);
        System.out.println("Total size = " + l.size());
        System.out.println("First occurance of B at index " + l.indexOf('B'));
        System.out.println(l instanceof Serializable);
        System.out.println(l instanceof Cloneable);
        System.out.println(l instanceof RandomAccess);
    }
}
