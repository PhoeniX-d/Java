/*
*   Program to find numbers which are divisible by 5 and even
*/

import java.util.*;

class ArrayDivisibleBy5_Even
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
        final ArrayDivisibleBy5_EvenSol slObj = new ArrayDivisibleBy5_EvenSol();
        System.out.println("Numbers Divisible by 5 and even are:");
        slObj.ArrayDivisibleBy5_Even(iArr);
        sObj.close();
    }
}

class ArrayDivisibleBy5_EvenSol
{
    public void ArrayDivisibleBy5_Even(final int iArr[])
    {
        for (int i = 0; i < iArr.length; i++)
        {
            if (iArr[i] % 5 == 0 && iArr[i] % 2 == 0) 
            {
                System.out.printf("%d ", iArr[i]);
            }
        }
    }
}
