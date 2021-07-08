/*
*   Write java program which accept array of characters from user and
*   count number of capital characters. 
*/

import java.util.*;

class ArrayCountUpr {
    public static void main(String argv[]) {
        Scanner sObj = new Scanner(System.in);
        System.out.printf("Enter the total number of elements\t:");
        int iValue = sObj.nextInt();
        char cArr[] = new char[iValue];

        System.out.printf("Enter the elements\n");
        for (int i = 0; i < cArr.length; i++) {
            cArr[i] = sObj.next().charAt(0);
        }
        sObj.close();

        Count slObj = new Count();
        int iRet = slObj.countUpr(cArr);
        System.out.println("Capital characters in array are\t:" + iRet);

    }
}

class Count {
    public int countUpr(char cArr[]) {
        int iCnt = 0, i = 0;
        for (i = 0; i < cArr.length; i++) {
            if (cArr[i] >= 'A' && cArr[i] <= 'Z') {
                iCnt++;
            }
        }
        if (iCnt != 0) {
            return iCnt;
        }
        return -1;
    }
}
