/* Program to find largest of three */

import java.util.Scanner;
public class LargestOfThree 
{
    public static void main(String[] args) 
    {
        int iVal1 = 0, iVal2 = 0, iVal3 = 0, iRet = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number\t= ");
        iVal1 = sc.nextInt();
        System.out.print("Enter the second number\t= ");
        iVal2 = sc.nextInt();
        System.out.print("Enter the third number\t= ");
        iVal3 = sc.nextInt();
        sc.close();
        iRet = maxOfThree(iVal1, iVal2, iVal3);
        System.out.println("Maximum is\t= " + iRet);
    }

    public static int maxOfThree(int a, int b, int c)
    {
        if(a >= b && a >= c)
            return a;
        else if(b >= a && b >=c)
            return b;
        else
            return c;
    }
}
