/*
    Happy number: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1, or it loops endlessly in a cycle which does not include 1.
    Example: 19 is a happy number
*/

import java.util.HashSet;
import java.util.Scanner;
public class IsHappy
{
    public static void main(String[] args)
    {
        int iNum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number\t= ");
        iNum = sc.nextInt();
        sc.close();

        iNum = iNum < 0 ? -iNum : iNum;
        
        for(int i = 1; iNum > 0; i++)
        {
            if(isHappy(i))
            {
                System.out.print(i + " ");
                iNum--;
            }
        }
        
        /*
        boolean b = isHappy(iNum);
        if(b == true)
            System.out.println(iNum + " is Happy number");
        else
            System.out.println(iNum + " is not Happy number");
        */
    }

    public static boolean isHappy(int iNum)
    {
        int iSum = 0, iDig = 0;
        HashSet<Integer> cycle = new HashSet<Integer>();
        while(iSum != 1 && cycle.add(iSum))
        {
            iSum = 0;
            while(iNum > 0)
            {
                iDig = iNum % 10;
                iSum = iSum + (iDig * iDig);
                iNum = iNum / 10;
            }
            iNum = iSum;
        }
        if(iSum == 1)
            return true;
        else 
            return false;
    }
}
