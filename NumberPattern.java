/*
*   Program to find numbers which are divisible by 5 and even
*/

import java.util.*;

class NumberPattern
{
    public static void main(String argv[])
    {
        Scanner sObj = new Scanner(System.in);
        System.out.printf("Enter the total number of elements\t:");
        int iValue = sObj.nextInt();
        int iArr[] = new int[iValue];

        System.out.printf("Enter the elements\n");
        for(int i = 0; i < iArr.length; i++)
        {
            iArr[i] = sObj.nextInt();
        }
        NumberPatternSol slObj = new NumberPatternSol();
        System.out.println("Numbers Divisible by 5 and even are:");
        slObj.NumberPattern(iArr);
        sObj.close();
    }
}

class NumberPatternSol
{
    public void NumberPattern(int iArr[])
    {
        int i = 0, j = 0;
        for (i = 0; i < iArr.length; i++)
        {
            System.out.print(iArr[i] + "\t");
            for(j = 1; j <= iArr[i]; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
