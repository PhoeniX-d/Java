
/*
 * Write Java program which accept two arrays from user and display
 * difference between summation of 2 arrays
 */
import java.util.Scanner;

class Minimum {
    public void arrayMinimum(int A1[], int A2[]) {
        int i = 0, j = 0, iMin1 = A1[0], iMin2 = A2[0];
        for (i = 0; i < A1.length || i < A2.length; i++) {
            if (i < A1.length) {
                if (iMin1 > A1[i]) {
                    iMin1 = A1[i];
                }
            }
            if (i < A2.length) {
                if (iMin2 > A2[i]) {
                    iMin2 = A2[i];
                }
            }
        }
        System.out.println("Minimum of array 1 is \t:" + iMin1);
        System.out.println("Minimum of array 2 is \t:" + iMin2);
    }
}

class ArraysMin {
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

        Minimum dsObj = new Minimum();
        dsObj.arrayMinimum(iArr1, iArr2);
    }
}
