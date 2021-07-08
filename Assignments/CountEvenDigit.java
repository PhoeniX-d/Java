import java.util.Scanner;

/*
*   Program to count even number of digits from given number
*/
class CountEvenDigit
{
    public static void main(String argv[])
    {
        Scanner sObj = new Scanner(System.in);
        System.out.println("Enter the number");
        int iNum = sObj.nextInt();
        CountEvenDigitSol cObj = new CountEvenDigitSol();
        int iRet = cObj.countEvenDigit(iNum);
        System.out.printf("Total even number of digits are\t:%d", iRet);
        sObj.close();
    }
}

class CountEvenDigitSol
{
    public int countEvenDigit(int iNum)
    {
        if(iNum < 0)
        {
            iNum = -iNum;
        }
        int iCnt = 0, iDig = 0;
        while(iNum != 0)
        {
            iDig = iNum % 10;
            if (iDig % 2 == 0) {
                iCnt++;
            }
            iNum = iNum / 10;
        }
        return iCnt;
    }
}