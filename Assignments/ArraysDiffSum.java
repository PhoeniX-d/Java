
/*
 * Write Java program which accept two arrays from user and display
 * difference between summation of 2 arrays
 */
import java.util.Scanner;

class DiffSum {
    public int arrayDiffSum(int A1[], int A2[]) {
        int i = 0, j = 0, iSum1 = 0, iSum2 = 0;
        for (i = 0; i < A1.length || i < A2.length; i++) {
            if (i < A1.length) {
                iSum1 = iSum1 + A1[i];
            }
            if (i < A2.length) {
                iSum2 = iSum2 + A2[i];
            }
        }
        return iSum1 - iSum2;
    }
}

class ArraysDiffSum {
    public static void main(String argv[]) {
        Scanner sObj = new Scanner(System.in);
        int i = 0;
        System.out.printf("Enter the total number of elements in Array 1\t:");
        int iValue = sObj.nextInt();
        int iArr1[] = new int[iValue];
        System.out.printf("Enter the elements for array 1:\n");
        for (i = 0; i < iArr1.length; i++) {
            iArr1[i] = sObj.nextInt();
        }

        System.out.printf("Enter the total number of elements in Array 2\t:");
        iValue = sObj.nextInt();
        int iArr2[] = new int[iValue];
        System.out.printf("Enter the elements for array 2:\n");
        for (i = 0; i < iArr2.length; i++) {
            iArr2[i] = sObj.nextInt();
        }
        sObj.close();

        DiffSum dsObj = new DiffSum();
        int iRet = dsObj.arrayDiffSum(iArr1, iArr2);
        System.out.println("Difference between summation of arrays is\t:" + iRet);
        ;
    }
}
