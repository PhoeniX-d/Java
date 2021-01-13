import java.util.*;
import java.io.*;

class Matrix
{
    int arr[][];
    int r, c;

    public Matrix(int r, int c)
    {
        this.r = r;
        this.c = c;
        arr = new int[r][c];
    }

    public int[][] getMatrix() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for(int i = 0; i < r; i++)
        {
            String s = br.readLine();
            st = new StringTokenizer(s, " ");
            for(int j = 0; j < c; j++)
            {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        return arr;
    }

    public int[][] findSum(int a[][], int b[][])
    {
        int sum[][] = new int[r][c];
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        return sum;
    }

    public void displayMatrix(int res[][])
    {
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class MatrixSum
{
    public static void main(String[] args) throws IOException
    {
        Matrix obj1 = new Matrix(3, 3);
        Matrix obj2 = new Matrix(3, 3);

        int x[][], y[][], z[][];
        System.out.println("Enter elements for 1st matrix:");
        x = obj1.getMatrix();

        System.out.println("Enter elements for 2nd matrix:");
        y = obj2.getMatrix();

        z = obj1.findSum(x, y);

        System.out.println("Summation of matrix is:");
        obj2.displayMatrix(z);
    }
}
