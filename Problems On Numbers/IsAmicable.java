/*
   Amicable numbers are two different numbers so related that 
   the sum of the proper divisors of each is equal to the other number.
   The first ten amicable pairs are: (220, 284), (1184, 1210), (2620, 2924), (5020, 5564),
   (6232, 6368), (10744, 10856), (12285, 14595), (17296, 18416), (63020, 76084), and (66928, 66992).
*/

import java.util.Scanner;

public class IsAmicable
{
    public static void main(String[] args)
    {
        int iNum1 = 0, iNum2 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number\t= ");
        iNum1 = sc.nextInt();
        System.out.print("Enter the 2nd number\t= ");
        iNum2 = sc.nextInt();
        sc.close();

        iNum1 = iNum1 < 0 ? -iNum1 : iNum1;
        iNum2 = iNum2 < 0 ? -iNum2 : iNum2;
       
        
        boolean b = isAmicable(iNum1, iNum2);
        if(b == true)
            System.out.println(iNum1 + " and " + iNum2 + " are Amicable number");
        else
            System.out.println(iNum1 + " and " + iNum2 + " are not Amicable number");
        
    }

    public static boolean isAmicable(int iNum1, int iNum2)
    {
        int iSum1 = 0, iSum2 = 0;
        for(int i = (iNum1 / 2), j = (iNum2 / 2); i >= 1 || j >= 1; i--, j--)
        {
            if(i > 0 && iNum1 % i == 0)
            {   
                iSum1 = iSum1 + i;
            }
            if(j > 0 && iNum2 % j == 0)
            {    
                iSum2 = iSum2 + j;
            }
        }
        if(iSum1 == iNum2 && iSum2 == iNum1)
            return true;
        else 
            return false;
    }
}
