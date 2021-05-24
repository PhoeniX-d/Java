/*
    A number N is said to be a mystery number if the number can be expressed by the sum of two numbers.
    Note that these two numbers must be reverse of each other. It lies between 22 to 198, i.e. 22<=N<=198.
    It is called mystery numbers because these are the multiples of 11, and the sum of place values of 
    unit (1) and tens (10) place is 11 in decimal numeration.

    A number is split into two '2-digit' numbers in such a way that its unit and tens digits are interchanged.
    Find the mystery number?

    Find the mystery number between 81 and 95 that contains 0 at the unit place.
*/

import java.util.Scanner;
public class IsMystry
{
    public static void main(String[] args)
    {
        int iNum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number\t= ");
        iNum = sc.nextInt();
        sc.close();

        iNum = iNum < 0 ? -iNum : iNum;
        
        boolean b = isMystry(iNum);
        if(b == true)
            System.out.println(iNum + " is Mystry number");
        else
            System.out.println(iNum + " is not Mystry number");
    }

    public static boolean isMystry(int iNum)
    {
        int i = 0, j = 0;
        for(i = 1; i <= iNum / 2; i++)
        {
            j = revNum(i);
            System.out.println(i + "  " + j);
            if(i + j == iNum)
            {
                break;
            }
        }
        if(i + j == iNum)
            return true;
        else
            return false;
    }

    static int revNum(int iNum)
    {
        int iRev = 0;
        while(iNum > 0)
        {
            iRev = iRev * 10 + (iNum % 10);
            iNum = iNum / 10;
        }
        return iRev;
    }
}

