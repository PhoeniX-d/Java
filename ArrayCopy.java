/*
*   Write a java program which accept two array from user and copy
*   the contents of that array into another array in reverse order and
*   return new array
*/

import java.util.Scanner;

class Copy {
    public int[] copy(int A1[]) {
        int i = 0;
        int iRes[] = new int[A1.length];
        for (i = 0; i < A1.length; i++) {
            iRes[i] = A1[i];
        }
        return iRes;
    }
}

class ArrayCopy {
    public static void main(String argv[]) {
        Scanner sObj = new Scanner(System.in);
        int i = 0;
        System.out.printf("Enter the total number of elements in Array\t:");
        int iValue = sObj.nextInt();
        int iArr1[] = new int[iValue];
        System.out.printf("Enter the elements:\n");
        for (i = 0; i < iArr1.length; i++) {
            iArr1[i] = sObj.nextInt();
        }

        sObj.close();
        int iRes[] = new int[iArr1.length];
        Copy mObj = new Copy();
        iRes = mObj.copy(iArr1);
        System.out.printf("Arrays after copying :\n");
        for (i = 0; i < iRes.length; i++) {
            System.out.print(iRes[i] + " ");
        }
    }
}
