/*
*   Write Java program which accept array of characters from user and
*   replace each capital character with its corresponding small character
*/

import java.util.*;

class ArrayReplaceUpr {
    public static void main(String argv[]) {
        Scanner sObj = new Scanner(System.in);
        System.out.printf("Enter the total number of elements\t:");
        int iValue = sObj.nextInt();
        char cArr[] = new char[iValue];

        System.out.printf("Enter the elements\n");
        for (int i = 0; i < cArr.length; i++) {
            cArr[i] = sObj.next().charAt(0);
        }
        sObj.close();
        Replace slObj = new Replace();
        slObj.replaceUpr(cArr);
        System.out.println("New Array with Upper letters replaced with lower");
        for (int i = 0; i < cArr.length; i++) {
            System.out.print(cArr[i] + " ");
        }
    }
}

class Replace {
    public void replaceUpr(char cArr[]) {
        int iCnt = 0, i = 0;
        for (i = 0; i < cArr.length; i++) {
            if (cArr[i] >= 'A' && cArr[i] <= 'Z') {
                cArr[i] = (char)(cArr[i] + 'a' - 'A');
            }
        }
    }
}
