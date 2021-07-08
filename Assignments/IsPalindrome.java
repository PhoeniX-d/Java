
/*
*   Program to check whether string is palindrom or not without
*   considering its case
*/
import java.util.Scanner;

class IsPalindromeSol {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                if (s.charAt(i) != s.charAt(j) && s.charAt(j) != (char) (s.charAt(i) + 'a' - 'A')) {
                    break;
                }
            } else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                if (s.charAt(i) != s.charAt(j) && s.charAt(j) != (char) (s.charAt(i) + 'A' - 'a')) {
                    break;
                }

            } else if (s.charAt(i) != s.charAt(j)) {
                break;
            }
            i++;
            j--;
        }

        if (i >= j) {
            return true;
        }
        return false;
    }
}

public class IsPalindrome {
    public static void main(String argv[]) {
        IsPalindromeSol cObj = new IsPalindromeSol();
        Scanner sObj = new Scanner(System.in);
        boolean bret = false;

        System.out.print("Enter the String\t:");
        String szStr = sObj.nextLine();
        bret = cObj.isPalindrome(szStr);
        if (bret == true) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
        sObj.close();
    }
}
