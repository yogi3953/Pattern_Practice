import java.util.Scanner;
class LeftPyramidNum{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            int c=0;
            for(int k=1;k <= (n-i);k++)
            {
                System.out.print(" ");
                c++;
            }
            for(int j=c+1;j<=n;j++)
            {
                    System.out.print(j);
            }
            System.out.println();
        }
    }
}