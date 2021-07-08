
/*
*   Write a java program which accept matrix from user and swap the
*   contents of each consecutive Cols
*/
import java.util.Scanner;

class SwapCols {
    public void swapConsCols(int iArr[][]) {
        if (iArr.equals(null)) {
            System.out.println("Invalid inputs to swapConsCols()\n");
            return;
        }
        int i = 0, j = 0, iTemp = 0;
        for (i = 0; i < iArr.length; i++) {
            for (j = 0; j < iArr[i].length - 1; j = j + 2) {
                iTemp = iArr[i][j];
                iArr[i][j] = iArr[i][j + 1];
                iArr[i][j + 1] = iTemp;
            }
        }
    }
}

public class SwapConsCols {
    public static void main(String argv[]) {
        Scanner sObj = new Scanner(System.in);
        SwapCols sr = new SwapCols();
        System.out.print("Enter the total number of Cols\t:");
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

        sr.swapConsCols(iArr);

        System.out.println("Output Matrix:");
        for (i = 0; i < iRow; i++) {
            for (j = 0; j < iCol; j++) {
                System.out.printf("%-3d", iArr[i][j]);
            }
            System.out.println();
        }
    }
}
