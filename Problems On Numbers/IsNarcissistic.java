/*
   In number theory, a narcissistic number in a given number base b is a number that 
   is the sum of its own digits each raised to the power of the number of digits.
   Eg 153, 9474...etc
*/

import java.util.Scanner;
public class IsNarcissistic
{
    public static void main(String[] args)
    {
        long lNum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number\t= ");
        lNum = sc.nextLong();
        sc.close();

        lNum = lNum < 0 ? -lNum : lNum;

        for(int i = 1; lNum > 0; i++)
        {
            if(isNarcissistic(i))
            {
                System.out.print(i + " ");
                lNum--;
            }
        }
        /*
        boolean b = isNarcissistic(lNum);
        if(b == true)
            System.out.println(lNum + " is Narcissistic number");
        else
            System.out.println(lNum + " is not Narcissistic number");
        */
    }

    public static boolean isNarcissistic(long lNum)
    {
        int iDigits = 0, iCnt = 0;
        double dSum = 0.0;
        long lTemp = lNum;
        while(lNum > 0)
        {
            iCnt++;
            lNum = lNum / 10;
        }
        lNum = lTemp;
        while(lTemp > 0)
        {
            iDigits = (int)(lTemp % 10);
            dSum = dSum + Math.pow(iDigits, iCnt);
            lTemp = lTemp / 10;
        }
        
        if((long)(dSum) == lNum)
            return true;
        else
            return false;
       
    }
}
