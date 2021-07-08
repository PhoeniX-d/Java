/*
*   Program to find numbers which are divisible by 11
*/
import java.util.*;

class ArrayDivisibleBy11
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
        ArrayDivisibleBy11Sol slObj = new ArrayDivisibleBy11Sol();
        System.out.println("Numbers Divisible by 11 are:");
        slObj.divisibleBy11(iArr);
        sObj.close();
    }
}

class ArrayDivisibleBy11Sol
{
    public void divisibleBy11(int iArr[])
    {
        for (int i = 0; i < iArr.length; i++)
        {
            if (iArr[i] % 11 == 0) 
            {
                System.out.printf("%d ", iArr[i]);
            }
        }
    }
}
