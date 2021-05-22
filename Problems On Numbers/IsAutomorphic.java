/*
    A number is called an automorphic number if and only if the square of the given number 
    ends with the same number itself. For example, 25, 76 are automorphic numbers 
    because their square is 625 and 5776, respectively and the last two digits of 
    the square represent the number itself. 
*/

import java.util.Scanner;
public class IsAutomorphic
{
    public static void main(String[] args)
    {
        long lNum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number\t= ");
        lNum = sc.nextLong();
        sc.close();

        lNum = lNum < 0 ? -lNum : lNum;
        
        boolean b = isAutomorphic(lNum);
        if(b == true)
            System.out.println(lNum + " is Automorphic");
        else
            System.out.println(lNum + " is not Automorphic");
    }

    public static boolean isAutomorphic(long lNum)
    {
        long square = lNum * lNum;
        while(lNum > 0)
        {
            if(lNum % 10 != square % 10)
            {
                break;
            }
            lNum = lNum / 10;
            square = square / 10;
        }
        if(lNum == 0)
            return true;
        else
            return false;
    }
}
