/*
    A positive number is called armstrong number if it is equal to the sum of cubes of its digits.
    For example 0, 1, 153, 370, 371, 407 etc.
*/

import java.util.Scanner;
public class IsArmstrong
{
    public static void main(String[] args)
    {
        long lNum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number\t= ");
        lNum = sc.nextLong();
        sc.close();
        lNum = lNum < 0 ? -lNum : lNum;
        
        boolean b = isArmstrong(lNum);
        if(b == true)
            System.out.println(lNum + " is armstrong");
        else
            System.out.println(lNum + " is not armstrong");
    }

    public static boolean isArmstrong(long lNum)
    {
        long arm = 0L, temp = lNum;
        int iDig = 0;
        while(lNum > 0)
        {
            iDig = (int)(lNum % 10);
            arm = arm + (iDig * iDig * iDig);
            lNum = lNum / 10;
        }
        if(arm == temp)
            return true;
        else
            return false;
    }
}
