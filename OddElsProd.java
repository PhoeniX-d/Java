
/*
*   Program to search els in Array
*/
import java.util.Scanner;

class OddElsProdSol {
    public int oddProd(int iArr[]) {
        int iProd = 0, i = 0;
        for (i = 0; i < iArr.length; i++) {
            if (iArr[i] % 2 != 0) {
                if (iProd == 0) {
                    iProd = 1;
                }
                iProd = iProd * iArr[i];
            }
        }
        return iProd;
    }
}

class OddElsProd {
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

        OddElsProdSol aObj = new OddElsProdSol();
        int iRet = aObj.oddProd(iArr);
        System.out.printf("Product of all odd elements in array is\t:%d\n", iRet);
        sObj.close();
    }
}
