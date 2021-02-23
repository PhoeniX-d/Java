import java.util.*;

class ListIteratorDemo {
    public static void main(String[] args) {
        Vector v = new Vector();
        for(int i = 0; i <= 10; i++)
        {
            v.addElement(i);
        }
        System.out.println(v);
        
        
        /* Iterator can read and remove data */
        ListIterator litr = v.listIterator();
        while(litr.hasNext())
        {
            Integer I = (Integer) litr.next();
            if(I == 2)
            {
                litr.remove();
                System.out.println("Remove " + v);
            }
            else if(I == 5)
            {
                litr.add(55);
                System.out.println("Add " + v);
            }
            else if(I == 7)
            {
                litr.set(70);
                System.out.println("Set/Replace " + v);
            }
        }
        System.out.println(v);
        System.out.println("Reverse traversal");
        while (litr.hasPrevious())
        {
            System.out.print((Integer) litr.previous() + " ");
        }
    }    
}
