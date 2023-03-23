import java.util.Scanner;

public class A1113353_0317_01 {
    public static void main(String[] argv)
    {
        int n,m;
        Scanner num = new Scanner(System.in);
        System.out.println("請輸入n的值：");
        n = num.nextInt();
        System.out.println("請輸入m的值：");
        m = num.nextInt();
        int [][] Array = new int [n][m];
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                Array[i][j] = (i+1)*(j+1);
            }
        }
        System.out.println("輸入的二維陣列為：");
        for(int [] a : Array)
        {
            for(int b : a)
            {
                System.out.print(b+" ");
            }
        System.out.println();
        }
    }
    
}
