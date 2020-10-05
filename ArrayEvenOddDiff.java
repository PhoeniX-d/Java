/*
*   Program to find difference between even and odd elements of array
*/

import java.util.*;

class ArrayEvenOddDiff
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
        ArrayEvenOddDiffSol slObj = new ArrayEvenOddDiffSol();
        int iRet = slObj.evenOddDiff(iArr);
        System.out.printf("Difference between even and odd numbers is\t:%d\n", iRet);
        sObj.close();
    }
}

class ArrayEvenOddDiffSol
{
    public int evenOddDiff(int iArr[])
    {
        int iDiff = 0, iEvenSum = 0, iOddSum = 0;
        for (int i = 0; i < iArr.length; i++)
        {
            if (iArr[i] % 2 == 0) 
            {
                iEvenSum = iEvenSum + iArr[i];
            } else if (iArr[i] % 2 != 0) 
            {
                iOddSum = iOddSum + iArr[i];
            }
        }
        iDiff = iEvenSum - iOddSum;
        return iDiff;
    }
}
