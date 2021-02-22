import java.io.Serializable;
import java.util.*;
class ArrayListDemo
{
    public static void main(String[] args)
    {
        ArrayList l = new ArrayList();
        l.add('A');
        l.add(10);
        l.add('A');
        l.add(null);
        System.out.println(l);
        System.out.println(l.set(2, 'B'));
        System.out.println(l);
        l.add(2, 'M');
        l.add('N');
        System.out.println(l);
        System.out.println(l.size());
        System.out.println(l.indexOf('B'));
        System.out.println(l instanceof Serializable);
        System.out.println(l instanceof Cloneable);
        System.out.println(l instanceof RandomAccess);
    }
}
