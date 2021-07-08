import java.util.Scanner;
import java.io.*;

class Range
{
    public void maxRange(int iArr[])
    {
        int iStart = 0, iEnd = 0, iMax = 0, iMin = 0, i = 0;
        for(i = 0; i < iArr.length - 1; i++)
        {
            if (iArr[i] <= iArr[i + 1]) {
                if (iStart == 0 && iEnd == 0) {
                    iStart = i;
                }
                iEnd = i + 1;
            } else {
                if ((iMax - iMin) <= (iEnd - iStart)) {
                    iMin = iStart;
                    iMax = iEnd;
                }
                iStart = 0;
                iEnd = 0;
            }
        }
        if((iMin == 0) && (iMax == 0))
        {
            System.out.println("There is no such range");
        }
        System.out.println("Length of Subarray range is " + (iMax - iMin + 1));
        System.out.println("And elements from such range are");
        for(i = iMin; i <= iMax; i++)
        {
            System.out.print(iArr[i] + "\t");
        }
        System.out.println();

    }
}

public class MaxSubarray 
{
     public static void main(String argv[]) {
        Scanner sObj = new Scanner(System.in);
        int i = 0;
        System.out.printf("Enter the total number of elements in Array\t:");
        int iValue = sObj.nextInt();
        int iArr[] = new int[iValue];
        System.out.printf("Enter the elements for array:\n");
        for (i = 0; i < iArr.length; i++) {
            iArr[i] = sObj.nextInt();
        }
        sObj.close();
        Range dsObj = new Range();
        dsObj.maxRange(iArr);
    }
}
