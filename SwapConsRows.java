
/*
*   Write a java program which accept matrix from user and swap the
*   contents of each consecutive rows
*/
import java.util.Scanner;

class SwapRows {
    public void swapConsRows(int iArr[][]) {
        if (iArr.equals(null)) {
            System.out.println("Invalid inputs to swapConsRows()\n");
            return;
        }
        int i = 0, j = 0, iTemp = 0;
        for (i = 0; i < iArr.length - 1; i = i + 2) {
            for (j = 0; j < iArr[i].length && i < iArr.length - 1; j++) {
                iTemp = iArr[i][j];
                iArr[i][j] = iArr[i + 1][j];
                iArr[i + 1][j] = iTemp;
            }
        }
    }
}

public class SwapConsRows {
    public static void main(String argv[]) {
        Scanner sObj = new Scanner(System.in);
        SwapRows sr = new SwapRows();
        System.out.print("Enter the total number of rows\t:");
        int iRow = sObj.nextInt();
        System.out.print("Enter the total number of cols\t:");
        int iCol = sObj.nextInt();

        if (iRow < 0)
            iRow = -iRow;
        if (iCol < 0)
            iCol = -iCol;

        int iArr[][] = new int[iRow][iCol];
        int i = 0, j = 0;
        System.out.println("Enter the elements of matrix:");
        for (i = 0; i < iRow; i++) {
            for (j = 0; j < iCol; j++) {
                iArr[i][j] = sObj.nextInt();
            }
        }
        sObj.close();

        System.out.println("Input Matrix:");
        for (i = 0; i < iRow; i++) {
            for (j = 0; j < iCol; j++) {
                System.out.printf("%-3d", iArr[i][j]);
            }
            System.out.println();
        }

        sr.swapConsRows(iArr);

        System.out.println("Output Matrix:");
        for (i = 0; i < iRow; i++) {
            for (j = 0; j < iCol; j++) {
                System.out.printf("%-3d", iArr[i][j]);
            }
            System.out.println();
        }
    }
}
