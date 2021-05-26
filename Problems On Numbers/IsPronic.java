/*
    A pronic number is a number which is the product of two consecutive integers, that is,
    a number of the form n(n + 1).The first few pronic numbers are:
    0, 2, 6, 12, 20, 30, 42, 56, 72, 90, 110, 132, 156, 182, 210 … etc.
*/

import java.util.Scanner;
public class IsPronic
{
    public static void main(String[] args)
    {
        int iNum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number\t= ");
        iNum = sc.nextInt();
        sc.close();

        iNum = iNum < 0 ? -iNum : iNum;
        ///*
        for(int i = 1; iNum > 0; i++)
        {
            if(isPronic(i))
            {
                System.out.print(i + " ");
                iNum--;
            }
        }
       // */
        /*
        boolean b = isPronic(iNum);
        if(b == true)
            System.out.println(iNum + " is Pronic number");
        else
            System.out.println(iNum + " is not Pronic number");
        */
    }

    public static boolean isPronic(int iNum)
    {
        int sqrt = (int)Math.sqrt(iNum);
        int prod = sqrt * (sqrt + 1);
        if(prod == iNum)
            return true;
        else 
            return false;
    }
}
