import java.util.Scanner;
import java.io.*;

class RaggedArray
{
    public static void main(String args[])
    {
        Scanner sObj = new Scanner(System.in);
        int iArr[][], iRows, iCols;
        System.out.println("Enter the  number of Rows you wanted");
        iRows = sObj.nextInt();

        iArr = new int[iRows][];
        System.out.println("Enter number of Columns for " + iRows + " Rows");
        for (int i = 0; i < iArr.length; i++)
        {
            System.out.println("Enter the number of Columns for " + (i + 1) + " th row");
            iCols = sObj.nextInt();
            iArr[i] = new int[iCols];
            System.out.println("Enter " + iCols + "elements for " + (i + 1) + " th row");
            for (int j = 0; j < iArr[i].length; j++) {
                iArr[i][j] = sObj.nextInt();
            }
        }
        sObj.close();

        System.out.println("\nRagged Array is:");
        for(int i = 0; i < iArr.length; i++)
        {
            for(int j = 0; j < iArr[i].length; j++)
            {
                System.out.print(iArr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
