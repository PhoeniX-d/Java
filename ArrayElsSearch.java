
/*
*   Program to search els in Array
*/
import java.util.Scanner;

class ArrayElsSearchSol {
    public boolean searchEl(int iArr[], int iNum) {
        int i = 0, j = 0;
        for (i = 0, j = iArr.length - 1; i <= j; i++, j--) {
            if (iArr[i] == iNum || iArr[j] == iNum) {
                break;
            }
        }
        if (i > j) {
            return false;
        }
        return true;
    }
}

class ArrayElsSearch {
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
        System.out.printf("Enter the number to be searched\t:");
        int iNum = sObj.nextInt();
        ArrayElsSearchSol aObj = new ArrayElsSearchSol();
        boolean bRet = aObj.searchEl(iArr, iNum);
        if (bRet == true) {
            System.out.printf("\nTRUE\n");
        } else {
            System.out.printf("\nFALSE\n");
        }
        sObj.close();
    }
}
