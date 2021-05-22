/*
    A number is said to be Peterson if the sum of factorials 
    of each digit is equal to the sum of the number itself.
*/

import java.util.Scanner;
public class IsPeterson
{
    public static void main(String[] args)
    {
        long lNum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number\t= ");
        lNum = sc.nextLong();
        sc.close();

        lNum = lNum < 0 ? -lNum : lNum;
        
        boolean b = isPeterson(lNum);
        if(b == true)
            System.out.println(lNum + " is Peterson");
        else
            System.out.println(lNum + " is not Peterson");
    }

    public static boolean isPeterson(long lNum)
    {
        long lFact = 0L, lSum = 0, lTemp = lNum;
        int i = 0, iDig = 0;
        while(lNum > 0)
        {
            iDig = (int)(lNum % 10);
            for(i = 1, lFact = 1; i <= iDig; i++)
            {
                lFact = lFact * i;
            }
            lSum += lFact;
            lNum = lNum / 10;
        }

        if(lTemp == lSum)
            return true;
        else
            return false;
    }
}
