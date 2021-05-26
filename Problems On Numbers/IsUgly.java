/*
    Write a Java program to check whether a given number is an ugly number.
    In number system, ugly numbers are positive numbers whose only prime factors are 2, 3 or 5. 
    First 10 ugly numbers are 1, 2, 3, 4, 5, 6, 8, 9, 10, 12. By convention, 1 is included.
*/

import java.util.Scanner;

public class IsUgly
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int iNum = 0;
        //boolean bRet = false;
        System.out.print("Enter the number\t= ");
        iNum = s.nextInt();
        s.close();
        iNum = iNum < 0 ? - iNum : iNum;
        for(int i = 1; iNum > 0; i++)
        {
            if(isUgly(i))
            {
                System.out.print(i + " ");
                iNum--;
            }
        }
        /*bRet = isUgly(iNum);
        if(bRet == true)
        {
            System.out.println("It is an ugly number");
        }
        else
        {
            System.out.println("It is not an ugly number");
        }*/
    }

    public static boolean isUgly(int iNum)
    {
        //iNum = iNum < 0 ? - iNum : iNum;
        boolean bRet = true;
        while(iNum != 1)
        {
            if(iNum % 5 == 0)
            {
                iNum = iNum / 5;
            }
            else if(iNum % 3 == 0)
            {
                iNum = iNum / 3;
            }
            else if(iNum % 2 == 0)
            {
                iNum = iNum / 2;
            }
            else
            {
                bRet = false;
                break;
            }
        }
        return bRet;         
    }
}