import java.util.Scanner;

class Calculate {
    public void calculate(int[][] iArr) {
        if (iArr.equals(null)) {
            System.out.println("Invalid inputs to transpose()\n");
            return;
        }
        if (iArr.length != iArr[0].length) {
            System.out.println("Number of rows and columns should be equal");
            return;
        }
        int i = 0, j = 0, iTrace = 0, iSum = 0;
        double dNorm = 0.0;
        for (i = 0; i < iArr.length; i++) {
            for (j = 0; j < iArr[i].length; j++) {
                if (i == j) {
                    iTrace = iTrace + iArr[i][j];
                }
                iSum = iSum + iArr[i][j];
            }
        }
        System.out.printf("\nTrace of Matrix is\t:%d\n", iTrace);
        System.out.printf("Normal of Matrix is\t:%f\n", Math.sqrt(iSum));
    }
}

public class TraceAndNormal {
    public static void main(String argv[]) {
        Scanner sObj = new Scanner(System.in);
        Calculate sr = new Calculate();
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

        sr.calculate(iArr);
    }
}
