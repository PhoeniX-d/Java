import java.util.*;

class StringConcat {
    public static void main(String argv[]) {
        Scanner sObj = new Scanner(System.in);
        String str1 = new String();
        String str2 = new String();
        int iNum = 0;

        System.out.print("Enter the first string\t:");
        str1 = sObj.nextLine();
        System.out.print("Enter the first string\t:");
        str2 = sObj.nextLine();
        System.out.print("Enter the number of characters to concat\t:");
        iNum = sObj.nextInt();

        // updater
        if (iNum < 0)
            iNum = -iNum;

        StrCatX sc = new StrCatX();
        str1 = sc.strCat(str1, str2, iNum);
        if (str1.isEmpty()) {
            System.out.println("String Concatination failed");
            return;
        }
        System.out.println("First string after concatination of " + iNum + " chars:");
        System.out.println(str1);
        sObj.close();
    }
}

class StrCatX {
    public String strCat(String s1, final String s2, int iNum) {
        if (s1.isEmpty() || s2.isEmpty()) {
            System.out.println("Invalid inputs to strCat()");
            return null;
        }
        if (iNum < 0)
            iNum = -iNum;

        char c1[] = new char[s1.length() + s2.length()];
        int i = 0, j = s1.length();

        while (i < s1.length()) {
            c1[i] = s1.charAt(i);
            i++;
        }
        i = 0;
        while (i < s2.length() && iNum != 0) {
            c1[j] = s2.charAt(i);
            j++;
            i++;
            iNum--;
        }

        s1 = new String(c1);
        return s1;
    }
}
