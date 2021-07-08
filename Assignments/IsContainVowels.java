
/*
*   Program to check vowels present in string or not
*/
import java.util.Scanner;

class IsContainVowelsSol {
    public boolean hasVowel(String szLine) {
        int i = 0;
        for (i = 0; i < szLine.length(); i++) {
            char ch = szLine.charAt(i);
            if (ch == 'a' || ch == 'A' || ch == 'o' || ch == 'O' || ch == 'e' || ch == 'E' || ch == 'u' || ch == 'U'
                    || ch == 'i' || ch == 'I') {
                break;
            }
        }
        if (i == szLine.length()) {
            return false;
        }
        return true;
    }
}

public class IsContainVowels {
    public static void main(String argv[]) {
        IsContainVowelsSol cObj = new IsContainVowelsSol();
        boolean bRet = false;
        Scanner sObj = new Scanner(System.in);

        System.out.print("Enter the String\t:");
        String szStr = sObj.nextLine();

        bRet = cObj.hasVowel(szStr);
        if (bRet == true) {
            System.out.println("\nTRUE");
        } else {
            System.out.println("\nFALSE");
        }
        sObj.close();
    }
}
