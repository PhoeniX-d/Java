
/*
*   Program to count Lower letters present in string
*/
import java.util.Scanner;

class CountLowerSol {
    public int countLwr(String szLine) {
        int i = 0, iCnt = 0;
        /*
         * char cArr[] = szLine.toCharArray(); for (i = 0; i < cArr.length; i++) { if
         * (cArr[i] >= 'a' && cArr[i] <= 'z') { iCnt++; } }
         */
        for (i = 0; i < szLine.length(); i++) {
            if (szLine.charAt(i) >= 'a' && szLine.charAt(i) <= 'z') {
                iCnt++;
            }
        }
        return iCnt;
    }
}

public class CountLower {
    public static void main(String argv[]) {
        CountLowerSol cObj = new CountLowerSol();
        int iRet = 0;
        Scanner sObj = new Scanner(System.in);

        System.out.print("Enter the String\t:");
        String szStr = sObj.nextLine();

        iRet = cObj.countLwr(szStr);
        System.out.printf("Total Small characters are\t:%d\n", iRet);
        sObj.close();
    }
}
