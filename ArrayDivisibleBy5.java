/*
*   Program to find numbers which are divisible by 5
*/
import java.util.*;

class ArrayDivisibleBy5
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
        ArrayDivisibleBy5Sol slObj = new ArrayDivisibleBy5Sol();
        System.out.println("Numbers Divisible by 5 are:");
        slObj.divisibleBy5(iArr);
        sObj.close();
    }
}

class ArrayDivisibleBy5Sol
{
    public void divisibleBy5(int iArr[])
    {
        for (int i = 0; i < iArr.length; i++)
        {
            if (iArr[i] % 5 == 0) 
            {
                System.out.printf("%d ", iArr[i]);
            }
        }
    }
}
