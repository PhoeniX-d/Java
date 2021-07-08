
/*
 * Write Java program which accept two arrays from user and display
 * summation of each array
 */
import java.util.Scanner;

class Sum {
    public void arraySum(int A1[], int A2[]) {
        int i = 0, j = 0, iSum1 = 0, iSum2 = 0;
        for (i = 0; i < A1.length || i < A2.length; i++) {
            if (i < A1.length) {
                iSum1 = iSum1 + A1[i];
            }
            if (i < A2.length) {
                iSum2 = iSum2 + A2[i];
            }
        }
        System.out.println("Summation of array 1 is \t:" + iSum1);
        System.out.println("Summation of array 2 is \t:" + iSum2);
    }
}

class ArraysSum {
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

        Sum mObj = new Sum();
        mObj.arraySum(iArr1, iArr2);
    }
}
