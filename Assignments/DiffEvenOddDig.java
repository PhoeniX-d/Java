import java.util.Scanner;
/* 
*   Program to calculate difference between summation of even and odd digits of a number 
*/

class DiffEvenOddDig {
    public static void main(String argv[]) {
        Scanner sObj = new Scanner(System.in);
        System.out.printf("Enter the number\t:");
        int iNum = sObj.nextInt();
        DiffEvenOddDigSol cObj = new DiffEvenOddDigSol();
        int iRet = cObj.diffEvenOddDig(iNum);
        System.out.printf("Difference is\t:%d", iRet);
        sObj.close();
    }
}

class DiffEvenOddDigSol {
    public int diffEvenOddDig(int iNum) {
        int iEsum = 0, iOsum = 0, iDig = 0;
        if (iNum < 0) {
            iNum = -iNum;
        }
        while (iNum != 0) {
            iDig = iNum % 10;
            if (iDig % 2 == 0) {
                iEsum = iEsum + iDig;
            } else if (iDig % 2 != 0) {
                iOsum = iOsum + iDig;
            }
            iNum = iNum / 10;
        }
        return iEsum - iOsum;
    }
}