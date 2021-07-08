
/*
*   Program to compute difference between Upper and Lower letters present in string
*/
import java.util.Scanner;

class DiffUprLwrSol {
    public int diffUprLwr(String szLine) {
        int i = 0, iU = 0, iL = 0;
        for (i = 0; i < szLine.length(); i++) {
            if (szLine.charAt(i) >= 'a' && szLine.charAt(i) <= 'z') {
                iL++;
            } else if (szLine.charAt(i) >= 'A' && szLine.charAt(i) <= 'Z') {
                iU++;
            }
        }
        return iU - iL;
    }
}

public class DiffUprLwr {
    public static void main(String argv[]) {
        DiffUprLwrSol cObj = new DiffUprLwrSol();
        int iRet = 0;
        Scanner sObj = new Scanner(System.in);

        System.out.print("Enter the String\t:");
        String szStr = sObj.nextLine();

        iRet = cObj.diffUprLwr(szStr);
        System.out.printf("Difference between upper and lower letters is\t:%d\n", iRet);
        sObj.close();
    }
}
