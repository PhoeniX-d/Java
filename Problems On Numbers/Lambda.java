import java.util.TreeSet;

class Lambda
{
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<Integer>((I1, I2)->(I1 > I2) ? -1 : (I1 < I2) ? 1 : 0);
        t.add(12);
        t.add(6);
        t.add(232);
        t.add(1);
        t.add(92);
        t.add(1212);
        System.out.println(t);
    }
}

