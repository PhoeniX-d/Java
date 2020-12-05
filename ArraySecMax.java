import java.util.Scanner;

class SecondMaximum {
    public void arraySecondMaximum(int A1[]) {
        int i = 0, j = 0, iMax1 = A1[0], iMax2 = A1[0];
        for (i = 0; i < A1.length; i++) 
        {
            if(A1[i] > iMax1)
            {
                iMax2 = iMax1;
                iMax1 = A1[i];
            }
            else if(A1[i] > iMax2 && A1[i] != iMax1)
            {
                iMax2 = A1[i];
            }
            else if(iMax1 == iMax2)
            {
                iMax2 = A1[i];
            }
        }
        System.out.println("Second Maximum of array is \t:" + iMax2);
    }
}

class ArraySecMax {
    public static void main(String argv[]) {
        Scanner sObj = new Scanner(System.in);
        int i = 0;
        System.out.printf("Enter the total number of elements in Array\t:");
        int iValue = sObj.nextInt();
        int iArr[] = new int[iValue];
        System.out.printf("Enter the elements for array:\n");
        for (i = 0; i < iArr.length; i++) {
            iArr[i] = sObj.nextInt();
        }
        sObj.close();

        SecondMaximum dsObj = new SecondMaximum();
        dsObj.arraySecondMaximum(iArr);
    }
}
