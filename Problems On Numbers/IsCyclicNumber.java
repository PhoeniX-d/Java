/*
    A cyclic number is an integer in which cyclic permutations of the digits are successive 
    multiples of the number. The most widely known are 142857:
*/

import java.util.Scanner;

public class IsCyclicNumber
{
    public static void main(String[] args)
    {
        long lNum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number\t= ");
        lNum = sc.nextLong();
        sc.close();
        lNum = lNum < 0 ? -lNum : lNum;
        
        boolean b = isCyclicNumber(lNum);
        if(b == true)
            System.out.println(lNum + " is Cyclic number number");
        else
            System.out.println(lNum + " is not Cyclic number number");
    }

    public static boolean isCyclicNumber(long lNum)
    {
        long lOriginal = lNum;
        int iLength = Long.toString(lNum).length();
        boolean flag = true;
        int iDig = 0;
        for(int i = 1 ; i <= iLength; i++)
        {
            if(lNum % lOriginal != 0)
            {
                flag = false;
                break;
            }
            iDig = (int)(lNum % 10);
            lNum = lNum / 10;
            lNum = lNum + iDig * (long)Math.pow(10, iLength - 1);
        }
        if(flag == true)
            return true;
        else return false;
    }
}
