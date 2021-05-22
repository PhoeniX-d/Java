/*
   A number is called a tech number if the given number has an even number of digits and 
   the number can be divided exactly into two parts from the middle. After equally dividing the number, 
   sum up the numbers and find the square of the sum. If we get the number itself as square, 
   the given number is a tech number, else, not a tech number. For example, 3025 is a tech number. 
*/

import java.util.Scanner;
public class IsTech
{
    public static void main(String[] args)
    {
        long lNum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number\t= ");
        lNum = sc.nextLong();
        sc.close();

        lNum = lNum < 0 ? -lNum : lNum;
        
        boolean b = isTech(lNum);
        if(b == true)
            System.out.println(lNum + " is Tech number");
        else
            System.out.println(lNum + " is not Tech number");
    }

    public static boolean isTech(long lNum)
    {
        int iDigits = 0;
        long lTemp = lNum, lSqr = 0L, lN1 = 0, lN2 = 0;
        while(lTemp > 0)
        {
            iDigits++;
            lTemp = lTemp / 10;
        }        
        if(iDigits % 2 != 0)
        {
            return false;
        }
        else
        {
            lN1 = lNum % (long)Math.pow(10, iDigits / 2);
            lN2 = lNum / (long)Math.pow(10, iDigits / 2);
            lSqr = (lN1 + lN2) * (lN1 + lN2);
            if(lSqr == lNum)
                return true;
            else
                return false;
        }
    }
}
