import java.text.*;
import java.util.*;

class FactoryMethod
{
    public static void main(String[] args)
    {
        final double PI = (double)22/7;
        double r = 15.5;
        double area = PI * r * r;
        System.out.println("Area = \t"  + area);

        NumberFormat obj = NumberFormat.getNumberInstance();

        obj.setMaximumFractionDigits(2);
        obj.setMinimumFractionDigits(7);

        String str = obj.format(area);
        System.out.println("Formated area = " + str);
    }
}
