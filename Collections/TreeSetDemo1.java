
import java.util.*;
class TreeSetDemo1
{
    public static void main(String[] args) {
        TreeSet t = new TreeSet(new MyComparator());
        t.add(10);
        t.add(0);
        t.add(15);
        t.add(5);
        t.add(10);
        t.add(50);
        t.add(25);
        System.out.println(t);
    }
}

class MyComparator implements Comparator
{
    public int compare(Object obj1, Object obj2)
    {
        Integer I1 = (Integer) obj1;
        Integer I2 = (Integer) obj2;
        /*if(I1 < I2)
            return 1;
        else if(I1 > I2)
            return -1;
        else
            return 0;*/

        //return I1.compareTo(I2);  //[Default Natural Sorting Order - Ascending for Numbers]
        return -I1.compareTo(I2); //[Descending order]
        //return I2.compareTo(I1);  //[Descending order]
        //return -I2.compareTo(I1);   //[Ascending order]
        //return 1;   //[Insertion order with duplicates]
        //return -1;   //[Reverse of Insertion order with duplicates]
        //return 0; //[Only first element will be inserted and remaining will be considered as duplicate]
    }
}
