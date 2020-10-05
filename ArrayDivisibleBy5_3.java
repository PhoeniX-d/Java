/*
*   Program to find numbers which are divisible by 5 and 3
*/

import java.util.*;

class ArrayDivisibleBy5_3
{
    public static void main(final String argv[])
    {
        final Scanner sObj = new Scanner(System.in);
        System.out.printf("Enter the total number of elements\t:");
        final int iValue = sObj.nextInt();
        final int iArr[] = new int[iValue];

        System.out.printf("Enter the elements\n");
        for(int i = 0; i < iArr.length; i++)
        {
            iArr[i] = sObj.nextInt();
        }
        final ArrayDivisibleBy5_3Sol slObj = new ArrayDivisibleBy5_3Sol();
        System.out.println("Numbers Divisible by 5 and 3 are:");
        slObj.divisibleBy5_3(iArr);
        sObj.close();
    }
}

class ArrayDivisibleBy5_3Sol
{
    public void divisibleBy5_3(final int iArr[])
    {
        for (int i = 0; i < iArr.length; i++)
        {
            if (iArr[i] % 5 == 0 && iArr[i] % 3 == 0) 
            {
                System.out.printf("%d ", iArr[i]);
            }
        }
    }
}
