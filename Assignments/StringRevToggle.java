
/*
*   Program to reverse the string and toggle case 
*/
import java.util.Scanner;

class StrRevTgl {
    public String strRev(String szLine) {
        int i = 0, j = szLine.length() - 1;
        char ch = '\0', cArr[] = szLine.toCharArray();

        while (i < cArr.length) {
            if (cArr[i] >= 'A' && cArr[i] <= 'Z') {
                cArr[i] = (char) (cArr[i] + 'a' - 'A');
            } else if (cArr[i] >= 'a' && cArr[i] <= 'z') {
                cArr[i] = (char) (cArr[i] + 'A' - 'a');
            }
            i++;
        }
        i = 0;
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

public class StringRevToggle {
    public static void main(String argv[]) {
        StrRevTgl srtObj = new StrRevTgl();
        Scanner sObj = new Scanner(System.in);

        System.out.print("Enter the String\t:");
        String szStr = sObj.nextLine();

        String szLine = new String();
        szLine = srtObj.strRev(szStr);
        System.out.println("Output String\t:" + szLine);
        sObj.close();
    }
}
