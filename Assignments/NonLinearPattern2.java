
/*
*   Program on Non Linear Patterns
*/
import java.util.Scanner;

class NonLinearPattern2 {
    public static void main(String argv[]) {
        Scanner sObj = new Scanner(System.in);
        int iRows = 0, iCols = 0;
        System.out.print("Enter the number of rows\t:");
        iRows = sObj.nextInt();
        System.out.print("Enter the number of columns\t:");
        iCols = sObj.nextInt();
        sObj.close();

        Patterns pObj = new Patterns();
        System.out.println("\nPattern 1:");
        pObj.displayPattern1(iRows, iCols);

        System.out.println("\nPattern 2:");
        pObj.displayPattern2(iRows, iCols);

        System.out.println("\nPattern 3:");
        pObj.displayPattern3(iRows, iCols);

        System.out.println("\nPattern 4:");
        pObj.displayPattern4(iRows, iCols);

        System.out.println("\nPattern 5:");
        pObj.displayPattern5(iRows, iCols);
    }
}

class Patterns {

    public void displayPattern1(int iRows, int iCols) {
        if (iRows < 0) {
            iRows = -iRows;
        }
        if (iCols < 0) {
            iCols = -iCols;
        }
        if (iRows != iCols) {
            System.out.println("Please enter equal number of rows and columns");
            return;
        }
        int i = 0, j = 0;
        for (i = 1; i <= iRows; i++) {
            for (j = 1; j <= iCols; j++) {
                if (j == iRows - i + 1) {
                    System.out.print("#  ");
                } else {
                    System.out.print("*  ");
                }
            }
            System.out.println();
        }
    }

    public void displayPattern2(int iRows, int iCols) {
        if (iRows < 0) {
            iRows = -iRows;
        }
        if (iCols < 0) {
            iCols = -iCols;
        }
        if (iRows != iCols) {
            System.out.println("Please enter equal number of rows and columns");
            return;
        }
        int i = 0, j = 0;
        for (i = 1; i <= iRows; i++) {
            for (j = 1; j <= iCols; j++) {
                if (j == iRows - i + 1) {
                    System.out.print("#  ");
                } else if (j < iRows - i + 1) {
                    System.out.print("*  ");
                } else if (j > iRows - i + 1) {
                    System.out.print("@  ");
                }
            }
            System.out.println();
        }
    }

    public void displayPattern3(int iRows, int iCols) {
        if (iRows < 0) {
            iRows = -iRows;
        }
        if (iCols < 0) {
            iCols = -iCols;
        }
        if (iRows != iCols) {
            System.out.println("Please enter equal number of rows and columns");
            return;
        }
        int i = 0, j = 0;
        for (i = 1; i <= iRows; i++) {
            for (j = 1; j <= iCols; j++) {
                if (j == iRows - i + 1 || i == 1 || i == iRows || j == iCols || j == 1) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public void displayPattern4(int iRows, int iCols) {
        if (iRows < 0) {
            iRows = -iRows;
        }
        if (iCols < 0) {
            iCols = -iCols;
        }
        if (iRows != iCols) {
            System.out.println("Please enter equal number of rows and columns");
            return;
        }
        int i = 0, j = 0;
        for (i = 1; i <= iRows; i++) {
            for (j = 1; j <= iCols; j++) {
                if (j == iRows - i + 1 || i == 1 || i == iRows || j == iCols || j == 1) {
                    System.out.print("*  ");
                } else if (j < iRows - i + 1) {
                    System.out.print("#  ");
                } else if (j > iRows - i + 1) {
                    System.out.print("$  ");
                }
            }
            System.out.println();
        }
    }

    public void displayPattern5(int iRows, int iCols) {
        if (iRows < 0) {
            iRows = -iRows;
        }
        if (iCols < 0) {
            iCols = -iCols;
        }
        if (iRows != iCols) {
            System.out.println("Please enter equal number of rows and columns");
            return;
        }
        int i = 0, j = 0;
        for (i = 1; i <= iRows; i++) {
            for (j = 1; j <= iCols; j++) {
                if (j == i || i == 1 || i == iRows || j == iCols || j == 1) {
                    System.out.print(j + "  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
