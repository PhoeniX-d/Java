import java.util.Scanner;

/*
*   Program to count digits between 3 and 7 from given number
*/
class CountDigBet3_7
{
    public static void main(String argv[])
    {
        Scanner sObj = new Scanner(System.in);
        System.out.println("Enter the number");
        int iNum = sObj.nextInt();
        CountDigBet3_7Sol cObj = new CountDigBet3_7Sol();
        int iRet = cObj.countDigit(iNum);
        System.out.printf("Total number of digits between 3 and 7 are\t:%d", iRet);
        sObj.close();
    }
}

class CountDigBet3_7Sol
{
    public int countDigit(int iNum)
    {
        if(iNum < 0)
        {
            iNum = -iNum;
        }
        int iCnt = 0, iDig = 0;
        while(iNum != 0)
        {
            iDig = iNum % 10;
            if (iDig % 3 == 0 || iDig % 7 == 0) {
                iCnt++;
            }
            iNum = iNum / 10;
        }
        return iCnt;
    }
}