/*
*   Program to check whether array elements are palindrome or not
*/

import java.util.Scanner;

class Reverse {
    public void reverseEls(int A1[]) {
        int i = 0, iTemp = 0, iRev = 0;
        for (i = 0; i < A1.length; i++) {
            iTemp = A1[i];
            while (iTemp != 0) {
                iRev = iRev * 10 + (iTemp % 10);
                iTemp = iTemp / 10;
            }
            A1[i] = iRev;
            iRev = 0;
            iTemp = 0;
        }
    }
}

class ReverseArrayEls {
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
        Reverse mObj = new Reverse();
        mObj.reverseEls(iArr1);
        System.out.printf("Array elements after reversed:\n");
        for (i = 0; i < iArr1.length; i++) {
            System.out.print(iArr1[i] + "  ");
        }
    }
}
