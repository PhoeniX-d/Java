import java.util.*;

class StringNCompare {
    public static void main(String argv[]) {
        Scanner sObj = new Scanner(System.in);
        String str1 = new String();
        String str2 = new String();
        boolean bret = false;
        int iNum = 0;
        System.out.print("Enter the first string\t:");
        str1 = sObj.nextLine();
        System.out.print("Enter the first string\t:");
        str2 = sObj.nextLine();
        System.out.print("Enter the number of characters to compare\t:");
        iNum = sObj.nextInt();

        // updater
        if (iNum < 0)
            iNum = -iNum;

        StrNCmpX sc = new StrNCmpX();
        bret = sc.strNCmp(str1, str2, iNum);
        if (bret == true) {
            System.out.println("Two strings are equal");
        } else {
            System.out.println("Two strings are not equal");
        }
        sObj.close();
    }
}

class StrNCmpX {
    public boolean strNCmp(String s1, final String s2, int iNum) {
        if (s1.isEmpty() || s2.isEmpty()) {
            System.out.println("Invalid inputs to strCmp() either string is empty");
            return false;
        }

        if (iNum < 0)
            iNum = -iNum;

        int i = 0;

        while (i < s1.length() && iNum != 0) {
            if (s1.charAt(i) != s2.charAt(i)) {
                break;
            }
            iNum--;
            i++;
        }
        if (iNum == 0 || i == s1.length()) {
            return (true);
        }
        return false;
    }
}
