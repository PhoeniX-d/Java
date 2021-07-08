import java.util.Scanner;

/*
*   Program to count Odd number of digits from given number
*/
class CountOddDigit
{
    public static void main(String argv[])
    {
        Scanner sObj = new Scanner(System.in);
        System.out.println("Enter the number");
        int iNum = sObj.nextInt();
        CountOddDigitSol cObj = new CountOddDigitSol();
        int iRet = cObj.countOddDigit(iNum);
        System.out.printf("Total Odd number of digits are\t:%d", iRet);
        sObj.close();
    }
}

class CountOddDigitSol
{
    public int countOddDigit(int iNum)
    {
        if(iNum < 0)
        {
            iNum = -iNum;
        }
        int iCnt = 0, iDig = 0;
        while(iNum != 0)
        {
            iDig = iNum % 10;
            if (iDig % 2 != 0) {
                iCnt++;
            }
            iNum = iNum / 10;
        }
        return iCnt;
    }
}