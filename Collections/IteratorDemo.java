import java.util.*;

class IteratorDemo {
    public static void main(String[] args) {
        Vector v = new Vector();
        for(int i = 0; i <= 10; i++)
        {
            v.addElement(i);
        }
        System.out.println(v);
        
        /* Iterator can read and remove data */
        Iterator itr = v.iterator();
        while(itr.hasNext())
        {
            Integer I = (Integer) itr.next();
            if (I % 2 == 0) {
                System.out.print(I + " ");
            }
            else
                itr.remove();
        }
        System.out.println();
        System.out.println(v);
    }    
}
