
/*
 * Write Java program which accept two arrays from user and form new array which
 * is combination of contents of first and second array
 */
import java.util.Scanner;

class Merger {
    public int[] arrayMerger(int A1[], int A2[]) {
        int i = 0, j = 0;
        int iRes[] = new int[A1.length + A2.length];
        for (i = 0; i < A1.length; i++) {
            iRes[i] = A1[i];
        }
        j = i;
        for (i = 0; i < A2.length; i++, j++) {
            iRes[j] = A2[i];
        }
        return iRes;
    }
}

class ArrayMerger {
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
        int iRes[] = new int[iArr1.length + iArr2.length];
        Merger mObj = new Merger();
        iRes = mObj.arrayMerger(iArr1, iArr2);
        System.out.printf("Arrays after merge:\n");
        for (i = 0; i < iRes.length; i++) {
            System.out.print(iRes[i] + " ");
        }
    }
}
