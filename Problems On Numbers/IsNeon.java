/*
   A positive integer whose sum of digits of its square is equal 
   to the number itself is called a neon number.
*/

import java.util.Scanner;
public class IsNeon
{
    public static void main(String[] args)
    {
        long lNum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number\t= ");
        lNum = sc.nextLong();
        sc.close();
        lNum = lNum < 0 ? -lNum : lNum;
        
        boolean b = isNeon(lNum);
        if(b == true)
            System.out.println(lNum + " is Neon number");
        else
            System.out.println(lNum + " is not Neon number");
    }

    public static boolean isNeon(long lNum)
    {
        long lNeon = lNum * lNum, lSum = 0;
        int iDig = 0;
        while(lNeon > 0)
        {
            iDig = (int)(lNeon % 10);
            lSum = lSum + iDig;       
            lNeon = lNeon / 10;
        }
        if(lSum == lNum)
            return true;
        else
            return false;
    }
}
