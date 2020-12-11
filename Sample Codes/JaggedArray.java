public class JaggedArray {
    public static void main(String[] args) {
        /*int x[][] = new int[2][];
        
        x[0] = new int[3];
        x[1] = new int[2];
        
        x[0][0] = 1;
        x[0][1] = 3;
        x[0][2] = 13;
        
        x[1][0] = 12;
        x[1][1] = 13;
        
        for(int i = 0; i < x.length; i++)
        {
            for(int j = 0; j < x[i].length; j++)
            {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }*/
        
        /* 1D array 
        int a[] = new int[] { 1, 3, 54 };
        for(int j = 0; j < a.length; j++)
        {
            System.out.print(a[j] + " ");
        }
        System.out.println();
        */

        /* 2D array
        int b[][] = new int[][]
        {
            new int[]{11, 22, 43},
            new int[]{81, 47}
        };
        
        for(int i = 0; i < b.length; i++)
        {
            for(int j = 0; j < b[i].length; j++)
            {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        */
        
        /* 3D Array
        */
        int c[][][] = new int[][][]
        {
            new int[][]
            {
                new int[]{43},
                new int[]{81, 47}
                },            
            new int[][]
            {
                new int[]{11, 122, 43, 800},
                new int[]{81, 47, 12}
            }
        };


        for(int i = 0; i < c.length; i++)
        {
            for (int j = 0; j < c[i].length; j++) {
                for (int k = 0; k < c[i][j].length; k++) {
                    System.out.print(c[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
