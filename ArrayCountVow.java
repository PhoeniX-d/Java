/*
*   Write java program which accept array of characters from user and
*   count number of vowel. 
*/

import java.util.*;

class ArrayCountVow {
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
        int iRet = slObj.countVow(cArr);
        System.out.println("Vowels in array are\t:" + iRet);

    }
}

class Count {
    public int countVow(char cArr[]) {
        int iCnt = 0, i = 0;
        for (i = 0; i < cArr.length; i++) {
            if (cArr[i] == 'a' || cArr[i] == 'e' || cArr[i] == 'i' || cArr[i] == 'o' || cArr[i] == 'u'
            || cArr[i] == 'A' || cArr[i] == 'E' || cArr[i] == 'I' || cArr[i] == 'O' || cArr[i] == 'U') {
                iCnt++;
            }
        }
        if (iCnt != 0) {
            return iCnt;
        }
        return -1;
    }
}
