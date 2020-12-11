class Class2 {
    public static void main(String[] args) {
        for (String s : args) {
            System.out.println(s);
        }
    }
}

public class Class1
{
    public static void main(String[] args) {
        String names[] = { "abc", "pqr", "lmn" };
        Class2.main(names);
    }
}
