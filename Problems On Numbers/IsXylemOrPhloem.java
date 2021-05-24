/*
   A number N will be a xylem number if the sum of its extreme (first and last) digits is equal to
   the sum of mean (all digits except first and last) digits. 
   If the sum of extreme digits is not equal to the sum of mean digits, the number is called phloem number.
*/

import java.util.Scanner;
public class IsXylemOrPhloem
{
    public static void main(String[] args)
    {
        long lNum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number\t= ");
        lNum = sc.nextLong();
        
        sc.close();
        boolean b = isXylemOrPhloem(lNum);
        if(b == true)
            System.out.println(lNum + " is Xylem number");
        else
            System.out.println(lNum + " is Phloem number");
    }

    public static boolean isXylemOrPhloem(long lNum)
    {
        lNum = lNum < 0 ? -lNum : lNum;
        int iExtremeSum = 0, iMeanSum = 0;
        long lTemp = lNum;
        while(lNum > 0)
        {
            if(lNum == lTemp || lNum < 10)
                iExtremeSum = iExtremeSum + (int)(lNum % 10);
            else
                iMeanSum = iMeanSum + (int)(lNum % 10);

            lNum = lNum / 10;
        }
        System.out.println(iExtremeSum + "  " + iMeanSum);
        return iExtremeSum == iMeanSum;
    }
}
