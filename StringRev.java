
/*
*   Program to check vowels present in string or not
*/
import java.util.Scanner;

class StringRevSol {
    public String strRev(String szLine) {
        int i = 0, j = szLine.length() - 1;
        char ch = '\0', cArr[] = szLine.toCharArray();
        while (i < j) {
            ch = cArr[i];
            cArr[i] = cArr[j];
            cArr[j] = ch;

            i++;
            j--;
        }
        String szStr = new String(cArr);
        return szStr;
    }
}

public class StringRev {
    public static void main(String argv[]) {
        StringRevSol cObj = new StringRevSol();
        Scanner sObj = new Scanner(System.in);

        System.out.print("Enter the String\t:");
        String szStr = sObj.nextLine();

        System.out.println("Input String\t:" + szStr);
        String szLine = new String();
        szLine = cObj.strRev(szStr);
        System.out.println("Output String\t:" + szLine);
        sObj.close();
    }
}
