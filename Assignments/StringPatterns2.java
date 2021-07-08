
/*
*   Program on Non Linear Patterns
*/
import java.util.Scanner;

class StringPatterns2 {
    public static void main(String argv[]) {
        Scanner sObj = new Scanner(System.in);
        String string = new String();
        System.out.print("Enter the String\t:");
        string = sObj.nextLine();
        sObj.close();

        Patterns pObj = new Patterns();
        System.out.println("\nPattern 1:");
        pObj.displayPattern1(string);

        System.out.println("\nPattern 2:");
        pObj.displayPattern2(string);

        System.out.println("\nPattern 3:");
        pObj.displayPattern3(string);

        System.out.println("\nPattern 4:");
        pObj.displayPattern4(string);
    }
}

class Patterns {

    public void displayPattern1(String string) {
        if (string.isEmpty()) {
            System.out.println("Invalid Inputs string is empty");
        }
        int i = 0, j = 0;
        for (i = 0; i < string.length(); i++) {
            for (j = 0; j < string.length(); j++) {
                if (j <= i) {
                    System.out.printf("%-3c", string.charAt(j));
                } else {
                    System.out.print("*  ");
                }
            }
            System.out.println();
        }
    }

    public void displayPattern2(String string) {
        if (string.isEmpty()) {
            System.out.println("Invalid Inputs string is empty");
        }
        int i = 0, j = 0;
        for (i = 0; i < string.length(); i++) {
            for (j = 0; j < string.length(); j++) {
                if (j < string.length() - i) {
                    System.out.printf("%-3c", string.charAt(j));
                } else {
                    System.out.print("*  ");
                }
            }
            System.out.println();
        }
    }

    public void displayPattern3(String string) {
        if (string.isEmpty()) {
            System.out.println("Invalid Inputs string is empty");
        }
        int i = 0, j = 0;
        for (i = 0; i < string.length() - 1; i++) {
            for (j = 0; j < string.length(); j++) {
                if (j < string.length() - i) {
                    System.out.printf("%-3c", string.charAt(j));
                } else {
                    System.out.print("*  ");
                }
            }
            System.out.println();
        }
        for (i = 0; i < string.length(); i++) {
            for (j = 0; j < string.length(); j++) {
                if (j <= i) {
                    System.out.printf("%-3c", string.charAt(j));
                } else {
                    System.out.print("*  ");
                }
            }
            System.out.println();
        }
    }

    public void displayPattern4(String string) {
        if (string.isEmpty()) {
            System.out.println("Invalid Inputs string is empty");
        }
        int i = 0, j = 0;
        for (i = 0; i < string.length() - 1; i++) {
            for (j = 0; j < string.length(); j++) {
                if (j <= i) {
                    System.out.printf("%-3c", string.charAt(j));
                } else {
                    System.out.print("#  ");
                }
            }
            System.out.println();
        }
        for (i = 0; i < string.length(); i++) {
            for (j = 0; j < string.length(); j++) {
                if (j < string.length() - i) {
                    System.out.printf("%-3c", string.charAt(j));
                } else {
                    System.out.print("#  ");
                }
            }
            System.out.println();
        }
    }
}