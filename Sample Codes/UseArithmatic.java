import Arithmatic.MyPackageDemo;

public class UseArithmatic
{
    public static void main(String[] args) {
        int n1 = 10, n2 = 23;
        MyPackageDemo mpd = new MyPackageDemo();

        System.out.println("Addition Imporetd from Arithmatic Package:\t" + mpd.add(n1, n2));
        System.out.println("Subtraction Imporetd from Arithmatic Package:\t" + mpd.sub(n1, n2));
        System.out.println("Multiplication Imporetd from Arithmatic Package:\t" + mpd.prod(n1, n2));
        System.out.println("Division Imporetd from Arithmatic Package:\t" + mpd.div(n1, n2));
    }
}
