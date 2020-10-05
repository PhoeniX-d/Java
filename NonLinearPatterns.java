
/*
*   Program on Non Linear Patterns
*/
import java.util.Scanner;

class NonLinearPattern {
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

        System.out.println("\nPattern 6:");
        pObj.displayPattern6(iRows, iCols);

        System.out.println("\nPattern 7:");
        pObj.displayPattern7(iRows, iCols);

        System.out.println("\nPattern 8:");
        pObj.displayPattern8(iRows, iCols);

        System.out.println("\nPattern 9:");
        pObj.displayPattern9(iRows, iCols);

        System.out.println("\nPattern 10:");
        pObj.displayPattern10(iRows, iCols);

    }
}

class Patterns {
    /*
     * Input : iRow = 4 iCol = 4 Output : A B C D A B C D A B C D A B C D
     */
    public void displayPattern1(int iRows, int iCols) {
        if (iRows < 0) {
            iRows = -iRows;
        }
        if (iCols < 0) {
            iCols = -iCols;
        }
        char ch = '\0';
        int i = 0, j = 0;
        for (i = 1; i <= iRows; i++) {
            ch = 'A';
            for (j = 1; j <= iCols; j++) {
                System.out.printf("%c ", ch);
                ch++;
            }
            System.out.println();
        }
    }

    /*
     * Input : iRow = 4 iCol = 4 Output : A B C D a b c d A B C D a b c d
     */
    public void displayPattern2(int iRows, int iCols) {
        if (iRows < 0) {
            iRows = -iRows;
        }
        if (iCols < 0) {
            iCols = -iCols;
        }
        char ch = '\0';
        int i = 0, j = 0;
        for (i = 1; i <= iRows; i++) {
            if (i % 2 == 0) {
                ch = 'a';
            } else {
                ch = 'A';
            }
            for (j = 1; j <= iCols; j++) {
                System.out.printf("%c ", ch);
                ch++;
            }
            System.out.println();
        }
    }

    /*
     * Input : iRow = 4 iCol = 4 Output : A A A A B B B B C C C C D D D D
     */
    public void displayPattern3(int iRows, int iCols) {
        if (iRows < 0) {
            iRows = -iRows;
        }
        if (iCols < 0) {
            iCols = -iCols;
        }
        char ch = '\0';
        int i = 0, j = 0;
        for (i = 1, ch = 'A'; i <= iRows; i++) {
            for (j = 1; j <= iCols; j++) {
                System.out.printf("%c ", ch);
            }
            ch++;
            System.out.println();
        }
    }

    /*
     * Input : iRow = 4 iCol = 4 Output : 4 4 4 4 3 3 3 3 2 2 2 2 1 1 1 1
     */
    public void displayPattern4(int iRows, int iCols) {
        if (iRows < 0) {
            iRows = -iRows;
        }
        if (iCols < 0) {
            iCols = -iCols;
        }
        int i = 0, j = 0;
        for (i = 1; i <= iRows; i++) {
            for (j = 1; j <= iCols; j++) {
                System.out.printf("%d ", iRows - i + 1);
            }
            System.out.println();
        }
    }

    /*
     * Input : iRow = 4 iCol = 4 Output : 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
     */
    public void displayPattern5(int iRows, int iCols) {
        if (iRows < 0) {
            iRows = -iRows;
        }
        if (iCols < 0) {
            iCols = -iCols;
        }
        int iNum = 1;
        int i = 0, j = 0;
        for (i = 1; i <= iRows; i++) {
            for (j = 1; j <= iCols; j++) {
                System.out.printf("%2d ", iNum);
                iNum++;
            }
            System.out.println();
        }
    }

    public void displayPattern6(int iRows, int iCols) {
        if (iRows < 0) {
            iRows = -iRows;
        }
        if (iCols < 0) {
            iCols = -iCols;
        }
        int i = 0, j = 0;
        for (i = 1; i <= iRows; i++) {
            for (j = 1; j <= iCols; j++) {
                System.out.printf("* ");
            }
            System.out.println();
        }
    }

    /*
     * Input : iRow = 4 iCol = 4 Output : A B C D a b c d A B C D a b c d
     */
    public void displayPattern7(int iRows, int iCols) {
        if (iRows < 0) {
            iRows = -iRows;
        }
        if (iCols < 0) {
            iCols = -iCols;
        }
        int i = 0, j = 0;
        for (i = 1; i <= iRows; i++) {
            for (j = 1; j <= iCols; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /*
     * Input : iRow = 4 iCol = 4 Output : A A A A B B B B C C C C D D D D
     */
    public void displayPattern8(int iRows, int iCols) {
        if (iRows < 0) {
            iRows = -iRows;
        }
        if (iCols < 0) {
            iCols = -iCols;
        }
        int i = 0, j = 0;
        for (i = 1; i <= iRows; i++) {
            for (j = 1; j <= iCols; j++) {
                System.out.printf((iCols - j + 1) + " ");
            }
            System.out.println();
        }
    }

    /*
     * Input : iRow = 4 iCol = 4 Output : 4 4 4 4 3 3 3 3 2 2 2 2 1 1 1 1
     */
    public void displayPattern9(int iRows, int iCols) {
        if (iRows < 0) {
            iRows = -iRows;
        }
        if (iCols < 0) {
            iCols = -iCols;
        }
        int i = 0, j = 0;
        for (i = 1; i <= iRows; i++) {
            for (j = 1; j <= iCols; j++) {
                if (j % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }

    /*
     * Input : iRow = 4 iCol = 4 Output : 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
     */
    public void displayPattern10(int iRows, int iCols) {
        if (iRows < 0) {
            iRows = -iRows;
        }
        if (iCols < 0) {
            iCols = -iCols;
        }
        int i = 0, j = 0;
        for (i = 1; i <= iRows; i++) {
            for (j = 1; j <= iCols; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

}