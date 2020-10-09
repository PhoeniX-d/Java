
/*
*   Program on Non Linear Patterns
*/
import java.util.Scanner;

class StringPatterns {
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

        System.out.println("\nPattern 5:");
        pObj.displayPattern5(string);
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
                System.out.print(string.charAt(j) + " ");
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
            for (j = 0; j < string.length() - i; j++) {
                System.out.print(string.charAt(j) + " ");
            }
            System.out.println();

        }
    }

    public void displayPattern3(String string) {
        if (string.isEmpty()) {
            System.out.println("Invalid Inputs string is empty");
        }
        int i = 0, j = 0;
        for (i = 0; i < string.length(); i++) {
            for (j = 0; j <= i; j++) {
                System.out.print(string.charAt(j) + " ");
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
            for (j = 0; j < string.length() - i; j++) {
                System.out.print(string.charAt(j) + " ");
            }
            System.out.println();

        }
        for (i = 0; i < string.length(); i++) {
            for (j = 0; j <= i; j++) {
                System.out.print(string.charAt(j) + " ");
            }
            System.out.println();

        }
    }

    public void displayPattern5(String string) {
        if (string.isEmpty()) {
            System.out.println("Invalid Inputs string is empty");
        }
        int i = 0, j = 0;

        for (i = 0; i < string.length() - 1; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print(string.charAt(j) + " ");
            }
            System.out.println();

        }
        for (i = 0; i < string.length(); i++) {
            for (j = 0; j < string.length() - i; j++) {
                System.out.print(string.charAt(j) + " ");
            }
            System.out.println();

        }
    }
}