import java.io.Serializable;
import java.util.*;
public class LinkedListDemo 
{
    public static void main(String[] args) 
    {
        LinkedList<String> l = new LinkedList<String>();
        l.add("luffy");
        //l.add(56);
        l.add(null);
        System.out.println(l);
        l.add("luffy");
        System.out.println(l);
        l.set(0, "kaizoku");
        System.out.println(l);
        l.add(0, "luffy");
        System.out.println(l);
        l.removeLast();
        l.addFirst("OnePiece");
        l.remove();
        System.out.println(l);
        System.out.println(l.size());
        System.out.println(l instanceof Serializable);
        System.out.println(l instanceof Cloneable);
        System.out.println(l instanceof RandomAccess);
    }
}
