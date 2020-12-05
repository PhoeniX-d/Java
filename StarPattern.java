import java.util.Scanner;
import java.io.*;

class Pattern {
    public void displayPattern1(int iNum) 
    {
        if (iNum < 0) {
            iNum = -iNum;
        }
        int i = 0, j = 0, iFirst = 0, iSecond = 1, iThird = 0;
        System.out.println("\nPattern1");
        for (i = 0; i < iNum; i++) {
            for (j = 0; j < iNum; j++) {
                if (i >= j) {
                    System.out.print(iFirst + "\t");
                    iThird = iFirst + iSecond;
                    iFirst = iSecond;
                    iSecond = iThird;
                } else {
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }

    public void displayPattern2(String str) 
    {
        if(str.equals(null))
        {
            System.out.println("String is Empty in displayPattern2()");
            return;
        }
        char cArr[] = str.toCharArray();
        int i = 0, j = 0;
        System.out.println("\nPattern2");
        for(i = 0; i < cArr.length; i++)
        {
            for(j = 0; i >= j; j++)
            {
                System.out.print(cArr[j] + "\t");
            }
            System.out.println();
        }
        for(i = cArr.length - 1; i > 0; i--)
        {
            for(j = 0; j < i; j++)
            {
                System.out.print(cArr[j] + "\t");
            }
            System.out.println();
        }
    }

    public void displayPattern3(String str) 
    {
        if(str.equals(null))
        {
            System.out.println("String is Empty in displayPattern3()");
            return;
        }
        char cArr[] = str.toCharArray();
        int i = 0, j = 0;
        System.out.println("\nPattern3");
        for(i = 0; i < cArr.length; i++)
        {
            for(j = 0; j < cArr.length; j++)
            {
                if(j < cArr.length - i)
                    System.out.print(cArr[j] + "\t");
            }
            System.out.println();
        }
        for(i = 0; i < cArr.length; i++)
        {
            for(j = 0; i >= j; j++)
            {
                System.out.print(cArr[j] + "\t");
            }
            System.out.println();
        }
    }
}

class StarPattern
{
    public static void main(String args[])
    {
        Scanner sObj = new Scanner(System.in);
        int iNum = 0;
        System.out.print("Enter the number of lines:\t");
        iNum = sObj.nextInt();
        Pattern p = new Pattern();
        p.displayPattern1(iNum);
        sObj.nextLine();
        System.out.print("Enter the string:\t");
        String str =  sObj.nextLine();
        p.displayPattern2(str);
        p.displayPattern3(str);
        sObj.close();
    }
}