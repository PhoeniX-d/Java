/* Program to check 2nd no is factor of 1st or not */

import java.util.Scanner;
public class CheckFactor 
{
    public static void main(String[] args) 
    {
        int iVal1 = 0, iVal2 = 0;
        boolean bRet = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number\t= ");
        iVal1 = sc.nextInt();
        System.out.print("Enter the second number\t= ");
        iVal2 = sc.nextInt();
        if(iVal2 == 0 || iVal1 == 0)
        {
            System.out.print("Entered number cannot be zero!!");
            System.exit(0);
        }
        sc.close();
        bRet = checkFactor(iVal1, iVal2);
        if(bRet)
            System.out.println(iVal2 + " is factor of " + iVal1);
        else
            System.out.println(iVal2 + " is not a factor of " + iVal1);

    }

    public static boolean checkFactor(int a, int b)
    {
        if(a % b == 0)
            return true;
        else
            return false;
    }
}
