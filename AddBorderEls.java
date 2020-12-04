import java.util.Scanner;

class Sum {
    public int sumBorder(int[][] iArr) {
        if (iArr.equals(null)) {
            System.out.println("Invalid inputs to transpose()\n");
            return 0;
        }

        int i = 0, j = 0, iSum = 0;
        for (i = 0; i < iArr.length; i++) {
            for (j = 0; j < iArr[i].length; j++) {
                if (i == 0 || j == 0 || i == (iArr.length - 1) || j == (iArr[i].length - 1)) {
                    iSum = iSum + iArr[i][j];
                }
            }
        }
        return iSum;
    }
}

public class AddBorderEls {
    public static void main(String argv[]) {
        Scanner sObj = new Scanner(System.in);
        Sum sr = new Sum();
        System.out.print("Enter the total number of rows\t:");
        int iRow = sObj.nextInt();
        System.out.print("Enter the total number of cols\t:");
        int iCol = sObj.nextInt();

        if (iRow < 0)
            iRow = -iRow;
        if (iCol < 0)
            iCol = -iCol;

        if (iRow != iCol) {
            System.out.println("Number of rows and columns should be equal");
            return;
        }

        int iArr[][] = new int[iRow][iCol];
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

        int iRet = sr.sumBorder(iArr);
        System.out.println("Summation of border element of matrix is\t:" + iRet);
    }
}
