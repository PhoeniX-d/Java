
/*
*   Program to count upper letters present in string
*/
import java.util.Scanner;

class CountUpperSol {
    public int countUpr(String szLine) {
        int i = 0, iCnt = 0;
        /*
         * char cArr[] = szLine.toCharArray(); for (i = 0; i < cArr.length; i++) { if
         * (cArr[i] >= 'A' && cArr[i] <= 'Z') { iCnt++; } }
         */
        for (i = 0; i < szLine.length(); i++) {
            if (szLine.charAt(i) >= 'A' && szLine.charAt(i) <= 'Z') {
                iCnt++;
            }
        }
        return iCnt;
    }
}

public class CountUpper {
    public static void main(String argv[]) {
        CountUpperSol cObj = new CountUpperSol();
        int iRet = 0;
        Scanner sObj = new Scanner(System.in);

        System.out.print("Enter the String\t:");
        String szStr = sObj.nextLine();

        iRet = cObj.countUpr(szStr);
        System.out.printf("Total Capital characters are\t:%d\n", iRet);
        sObj.close();
    }
}
