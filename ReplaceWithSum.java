/*
*   Write java program which accept array from user and replace each
*   member with summation of its digit
*/

import java.util.Scanner;

class Replace {
    public void replaceEls(int A1[]) {
        int i = 0, iTemp = 0, iSum = 0;
        for (i = 0; i < A1.length; i++) {
            iTemp = A1[i];
            while (iTemp != 0) {
                iSum = iSum + (iTemp % 10);
                iTemp = iTemp / 10;
            }
            A1[i] = iSum;
            iSum = 0;
            iTemp = 0;
        }
    }
}

class ReplaceWithSum {
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
        Replace mObj = new Replace();
        mObj.replaceEls(iArr1);
        System.out.printf("Array elements after replaced with their sum:\n");
        for (i = 0; i < iArr1.length; i++) {
            System.out.print(iArr1[i] + "  ");
        }
    }
}
