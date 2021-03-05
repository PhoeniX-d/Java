import java.util.*;
class VectorDemo
{
    public static void main(String[] args) 
    {
        Vector<Integer> v = new Vector<Integer>();
        System.out.println("Initial capacity " + v.capacity());
        for(int i = 1; i <= 10; i++)
        {
            v.addElement(i);
        }
        System.out.println("Capacity after adding 10 els " + v.capacity());
        v.addElement(100);
        System.out.println("Capacity after adding 11th el " + v.capacity());
        System.out.println(v);
    }
}
