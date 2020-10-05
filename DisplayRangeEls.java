
/*
*   Program to search els in Array
*/
import java.util.Scanner;

class DisplayRangeElsSol {
    public void rangeEls(int iArr[], int iS, int iE) {
        int i = 0;
        if (iS < 0) {
            iS = -iS;
        }
        if (iE < 0) {
            iE = -iE;
        }
        if (iS > iE || iE >= iArr.length) {
            System.out.println("Enter the valid range");
            return;
        }
        System.out.printf("Elements in enterd range are\n");
        for (i = iS; i < iE; i++) {
            System.out.printf("%d ", iArr[i]);
        }
    }
}

class DisplayRangeEls {
    public static void main(String argv[]) {
        Scanner sObj = new Scanner(System.in);
        System.out.print("Enter the number of elements:\t");
        int iNums = sObj.nextInt();
        if (iNums < 0) {
            iNums = -iNums;
        }

        int iArr[] = new int[iNums];
        System.out.printf("Enter the numbers\n");
        for (int i = 0; i < iNums; i++) {
            iArr[i] = sObj.nextInt();
        }
        System.out.printf("Enter start of range\t:");
        int iStart = sObj.nextInt();
        System.out.printf("Enter end of range\t:");
        int iEnd = sObj.nextInt();
        DisplayRangeElsSol aObj = new DisplayRangeElsSol();
        aObj.rangeEls(iArr, iStart, iEnd);
        sObj.close();
    }
}
