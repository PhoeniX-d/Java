
/*
*   Program to find last occurance of element in Array
*/
import java.util.Scanner;

class LastOccurSol {
    public int lastOccur(int iArr[], int iNum) {
        int i = 0;
        for (i = iArr.length - 1; i >= 0; i--) {
            if (iArr[i] == iNum) {
                break;
            }
        }
        if (i == -1) {
            return -1;
        }
        return i;
    }
}

class LastOccur {
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

        LastOccurSol aObj = new LastOccurSol();
        int iRet = aObj.lastOccur(iArr, iNum);
        if (iRet != -1) {
            System.out.printf("Element %d last occured at index\t:%d\n", iNum, iRet);
        } else {
            System.out.printf("\nElement Not found in array\n");
        }
        sObj.close();
    }
}
