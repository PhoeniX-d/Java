
/*
*   Write a java program which accept matrix from user and return its
*   transpose matrix.The transpose of a given matrix is formed by
*   interchanging the rows and columns of a matrix
*/
import java.util.Scanner;

class Transpose {
    public int[][] transpose(int iArr[][]) {
        if (iArr.equals(null)) {
            System.out.println("Invalid inputs to transpose()\n");
            return null;
        }
        int i = 0, j = 0, k = 0, l = 0;
        int Transpose[][] = new int[iArr[i].length][iArr.length];
        for (i = 0, l = 0; i < iArr.length; i++, l++) {
            for (j = 0, k = 0; j < iArr[i].length; j++, k++) {
                Transpose[k][l] = iArr[i][j];
            }
        }
        return Transpose;
    }
}

public class MatrixTranspose {
    public static void main(String argv[]) {
        Scanner sObj = new Scanner(System.in);
        Transpose sr = new Transpose();
        System.out.print("Enter the total number of rows\t:");
        int iRow = sObj.nextInt();
        System.out.print("Enter the total number of cols\t:");
        int iCol = sObj.nextInt();

        if (iRow < 0)
            iRow = -iRow;
        if (iCol < 0)
            iCol = -iCol;

        int iArr[][] = new int[iRow][iCol];
        int iRes[][] = new int[iRow][iCol];
        int i = 0, j = 0;
        System.out.println("Enter the elements of matrix:");
        for (i = 0; i < iArr.length; i++) {
            for (j = 0; j < iArr[i].length; j++) {
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

        iRes = sr.transpose(iArr);
        if (iRes.equals(null)) {
            return;
        }
        System.out.println("Transposed Matrix:");
        for (i = 0; i < iCol; i++) {
            for (j = 0; j < iRow; j++) {
                System.out.printf("%-3d", iRes[i][j]);
            }
            System.out.println();
        }
    }
}
