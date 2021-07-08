import java.util.*;

/*
*   Program to compare two strings
*/
class StringCompare {
    public static void main(String argv[]) {
        Scanner sObj = new Scanner(System.in);
        String str1 = new String();
        String str2 = new String();
        boolean bret = false;

        System.out.print("Enter the first string\t:");
        str1 = sObj.nextLine();
        System.out.print("Enter the first string\t:");
        str2 = sObj.nextLine();

        StrCmpX sc = new StrCmpX();
        bret = sc.strCmp(str1, str2);
        if (bret == true) {
            System.out.println("Two strings are equal");
        } else {
            System.out.println("Two strings are not equal");
        }
        sObj.close();
    }
}

class StrCmpX {
    public boolean strCmp(String s1, final String s2) {
        if (s1.isEmpty() || s2.isEmpty()) {
            System.out.println("Invalid inputs to strCmp() either string is empty");
            return false;
        }
        if (s1.length() != s2.length()) {
            return (false);
        }

        int i = 0;

        while (i < s1.length()) {
            if (s1.charAt(i) != s2.charAt(i)) {
                break;
            }
            i++;
        }
        if (i == s1.length()) {
            return (true);
        }
        return (false);
    }
}
