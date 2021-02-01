package Miscellaneous;

import java.util.Scanner;

class Division
{
    public static int divide(int iNum1, int iNum2)
    {
        int iRes = 0;
        try
        {
            iRes = iNum1 / iNum2;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.toString());
            iRes = -1;
        }
        return iRes;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1\t:");
        int iNum1 = sc.nextInt();
        System.out.print("Enter the number 1\t:");
        int iNum2 = sc.nextInt();
        int iRes = Division.divide(iNum1, iNum2);
        if(iRes != -1)
            System.out.println("Division of " + iNum1 + " and " + iNum2 + " is " + iRes);
        sc.close();
    }
}
