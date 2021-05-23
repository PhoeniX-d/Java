/*
  A positive integer is called a spy number if the sum and product of its digits are equal.
  In other words,a number whose sum and product of all digits are equal is called a spy number.
*/

import java.util.Scanner;
public class IsSpy
{
    public static void main(String[] args)
    {
        long lNum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number\t= ");
        lNum = sc.nextLong();
        sc.close();
        lNum = lNum < 0 ? -lNum : lNum;
        
        boolean b = isSpy(lNum);
        if(b == true)
            System.out.println(lNum + " is Spy number");
        else
            System.out.println(lNum + " is not Spy number");
    }

    public static boolean isSpy(long lNum)
    {
        long lProd = 1, lSum = 0;
        int iDig = 0;
        while(lNum > 0)
        {
            iDig = (int)(lNum % 10);
            if(iDig != 0)
            {
                lSum = lSum + iDig;
                lProd = lProd * iDig; 
            }    
            lNum = lNum / 10;
        }
        if(lSum == lProd)
            return true;
        else
            return false;
    }
}
